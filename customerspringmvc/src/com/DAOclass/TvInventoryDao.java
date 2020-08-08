package com.DAOclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Beanclass.InventoryProductBean;

public class TvInventoryDao {
	
	private static final String url = "jdbc:mysql://localhost:3306/customerdlvery";
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String username = "root";
	private static final String password ="HarisH*12";
	
	private static final String INSERT_PRODUCTS_SQL= "INSERT INTO customerdlvery.inventoryproductlist VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_PRODUCTS_BY_ID = "SELECT `SI.No`,`Company Name`,`Product Code`,`Product Description`,`Price Per Unit`,`Total Price`,`Quantity`,`Moved In Date`,`Moved In`,`Moved Out Date`,`Moved Out`,`Delivery Note No`,`Delivery Agent`,`Balance Quantity`,`Condition of the Product` FROM customerdlvery.inventoryproductlist WHERE `Product Code` = ?";
	private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM customerdlvery.inventoryproductlist";
	private static final String DELETE_PRODUCTS_SQL = "DELETE FROM customerdlvery.inventoryproductlist WHERE `Product Code` = ?";
	private static final String UPDATE_PRODUCTS_SQL = "UPDATE customerdlvery.inventoryproductlist set `SI.No` = ? , `Company Name`=? , `Product Description`=? , `Price Per Unit`=? , `Total Price`=? , `Quantity`=? , `Moved In Date`=? ,  `Moved In`=? , `Moved Out Date`=? , `Moved Out`=? ,`Delivery Note No`=?,`Delivery Agent`=?, `Balance Quantity`=? , `Condition of the Product` = ? WHERE `Product Code`=?";
	private static final String SELECT_PRODUCTS_BY_DATE = "SELECT `SI.No`,`Company Name`,`Product Code`,`Product Description`,`Quantity`,`Price Per Unit`,`Total Price`,`Moved In Date`,`Moved In`,`Moved Out Date`,`Moved Out`,`Delivery Note No`,`Delivery Agent`,`Balance Quantity`,`Condition of the Product` FROM customerdlvery.inventoryproductlist WHERE `Moved Out Date` BETWEEN ? AND ? ";
	
	protected Connection getConnection() throws ClassNotFoundException
	{
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void insertproduct(InventoryProductBean invenbean) throws SQLException
	{
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(INSERT_PRODUCTS_SQL))
		{
			preparedStatement.setInt(1, invenbean.getsINo());
			preparedStatement.setString(2, invenbean.getCompanyName());
			preparedStatement.setInt(3, invenbean.getProductCode());
			preparedStatement.setString(4, invenbean.getProductDescription());
			preparedStatement.setInt(5, invenbean.getQuantity());
			preparedStatement.setString(6, invenbean.getPricePerUnit());
			preparedStatement.setString(7, invenbean.getTotalPrice());
			preparedStatement.setString(8, invenbean.getMovedInDate());
			preparedStatement.setInt(9, invenbean.getMovedIn());
			preparedStatement.setString(10, invenbean.getMovedOutDate());
			preparedStatement.setInt(11, invenbean.getMovedOut());
			preparedStatement.setInt(12, invenbean.getDeliveryNoteNo());
			preparedStatement.setString(13, invenbean.getDeliveryAgent());
			preparedStatement.setInt(14, invenbean.getBalanceQuantity());
			preparedStatement.setString(15,invenbean.getConditionoftheProduct());
			
			preparedStatement.executeUpdate();
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean updateProduct(InventoryProductBean invenbean) throws SQLException, ClassNotFoundException
	{
		boolean row_updated;
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(UPDATE_PRODUCTS_SQL))
		{
			preparedStatement.setInt(1, invenbean.getsINo());			
			preparedStatement.setString(2, invenbean.getCompanyName());		
			preparedStatement.setString(3, invenbean.getProductDescription());
			preparedStatement.setString(4, invenbean.getPricePerUnit());
			preparedStatement.setString(5, invenbean.getTotalPrice());
			preparedStatement.setInt(6, invenbean.getQuantity());
			preparedStatement.setString(7, invenbean.getMovedInDate());
			preparedStatement.setInt(8, invenbean.getMovedIn());
			preparedStatement.setString(9, invenbean.getMovedOutDate());
			preparedStatement.setInt(10, invenbean.getMovedOut());
			preparedStatement.setInt(11, invenbean.getDeliveryNoteNo());
			preparedStatement.setString(12, invenbean.getDeliveryAgent());
			preparedStatement.setInt(13, invenbean.getBalanceQuantity());
			preparedStatement.setString(14,invenbean.getConditionoftheProduct());
			preparedStatement.setInt(15, invenbean.getProductCode());
			
			row_updated = preparedStatement.executeUpdate()>0;
		}
		return row_updated;
	}
	
	public InventoryProductBean selectProduct(int ProductCode) throws SQLException
	{
		InventoryProductBean inven = null;
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PRODUCTS_BY_ID))
		{
			preparedStatement.setInt(1, ProductCode);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int SINO = rs.getInt("SI.No");
				String Companyname = rs.getString("Company Name");
				String ProductDescription = rs.getString("Product Description");
				int Quantity = rs.getInt("Quantity");
				String PriceperUnit = rs.getString("Price Per Unit");
				String Totalprice = rs.getString("Total Price");
				String MovedInDate = rs.getString("Moved In Date");
				int MovedIn = rs.getInt("Moved In");
				String MovedOutDate = rs.getString("Moved Out Date");
				int MovedOut = rs.getInt("Moved Out");
				int DeliveryNoteNo = rs.getInt("Delivery Note No");
				String DeliveryAgent = rs.getString("Delivery Agent");
				int BalanceQuantity = rs.getInt("Balance Quantity");
				String ConditionOfTheProduct = rs.getString("Condition of the Product");
				
				inven = new InventoryProductBean(SINO,Companyname,ProductCode,ProductDescription,Quantity,PriceperUnit,Totalprice,MovedInDate,MovedIn,MovedOutDate,MovedOut,DeliveryNoteNo,DeliveryAgent,BalanceQuantity,ConditionOfTheProduct);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return inven;
	}
	
	public List<InventoryProductBean> selectAllproducts() throws SQLException
	{
		List<InventoryProductBean> invenbean = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_ALL_PRODUCTS))
		{
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int sINO = rs.getInt("SI.No");
				String companyname = rs.getString("Company Name");
				int productcode = rs.getInt("Product Code");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String priceperUnit = rs.getString("Price Per Unit");
				String totalprice = rs.getString("Total Price");
				String movedInDate = rs.getString("Moved In Date");
				int movedIn = rs.getInt("Moved In");
				String movedOutDate = rs.getString("Moved Out Date");
				int movedOut = rs.getInt("Moved Out");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int balanceQuantity = rs.getInt("Balance Quantity");
				String conditionOfTheProduct = rs.getString("Condition Of the Product");
								
				invenbean.add(new InventoryProductBean(sINO, companyname, productcode, productDescription,quantity,priceperUnit, totalprice, movedInDate, movedIn, movedOutDate, movedOut,deliveryNoteNo,deliveryAgent, balanceQuantity, conditionOfTheProduct));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return invenbean;
	}
	
	public boolean deleteProduct(int Productcode) throws SQLException
	{
		boolean row_deleted = false ;
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(DELETE_PRODUCTS_SQL))
		{
			preparedStatement.setInt(1, Productcode);
			row_deleted = preparedStatement.executeUpdate() > 0;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return row_deleted;
	}
	
	public List<InventoryProductBean> selectProductbyDate(String fromDate , String toDate) throws SQLException
	{
		List<InventoryProductBean> invenbean = new ArrayList<InventoryProductBean>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PRODUCTS_BY_DATE))
		{
			preparedStatement.setString(1, fromDate);
			preparedStatement.setString(2, toDate);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int sINO = rs.getInt("SI.No");
				String companyname = rs.getString("Company Name");
				int productcode = rs.getInt("Product Code");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String priceperUnit = rs.getString("Price Per Unit");
				String totalprice = rs.getString("Total Price");
				String movedInDate = rs.getString("Moved In Date");
				int movedIn = rs.getInt("Moved In");
				String movedOutDate = rs.getString("Moved Out Date");
				int movedOut = rs.getInt("Moved Out");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int balanceQuantity = rs.getInt("Balance Quantity");
				String conditionOfTheProduct = rs.getString("Condition Of the Product");
								
				invenbean.add(new InventoryProductBean(sINO, companyname, productcode, productDescription,quantity,priceperUnit, totalprice, movedInDate, movedIn, movedOutDate, movedOut,deliveryNoteNo,deliveryAgent, balanceQuantity, conditionOfTheProduct));
		
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return invenbean;
	}
	


}
