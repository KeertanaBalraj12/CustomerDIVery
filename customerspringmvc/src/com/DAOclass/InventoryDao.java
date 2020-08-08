package com.DAOclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Beanclass.Inventorylogin;

public class InventoryDao {

	public boolean validate(Inventorylogin invenbean) throws ClassNotFoundException
	{
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdlvery","root","HarisH*12");
				PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM customerdlvery.inventorylogin  WHERE UserID=? and Password=?");){
			preparedStatement.setString(1, invenbean.getUserID());
			preparedStatement.setString(2, invenbean.getPassword());
			ResultSet rs = preparedStatement.executeQuery();
			status=rs.next();	
		}
		catch(SQLException e)
		{
			printSQLException(e);
		}
		return status;
		
	}
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}