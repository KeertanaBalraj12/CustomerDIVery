package com.DAOclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Beanclass.DeliveryProductBean;

public class DeliveryProductDao {

	private static final String url = "jdbc:mysql://localhost:3306/customerdlvery";
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String username = "root";
	private static final String password ="HarisH*12";
	
	private static final String INSERT_PRODUCTS_SQL= "INSERT INTO customerdlvery.deliverydetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM customerdlvery.deliverydetails";
	private static final String UPDATE_PRODUCTS_SQL = "UPDATE customerdlvery.deliverydetails set `SI.No` = ?,`Delivery Date`=? , `Status of Delivery`=? ,`Emergency Delivery`=?,`Return to Warehouse`=? WHERE `Delivery Note No`=?";
	private static final String SELECT_PRODUCTS_BY_STATUS = "SELECT `SI.No`,`Delivery Agent`,`Delivery Note No`,`Delivery Note Date`,`Company Name`,`Product Description`,`Quantity`,`Customer Name and Address`,`Delivery Date`,`Status of Delivery`,`Emergency Delivery`,`Return to Warehouse` FROM customerdlvery.deliverydetails WHERE `Emergency Delivery` IN ('Yes') ";
	private static final String SELECT_RETURN_WAREHOUSE = "SELECT `SI.No`,`Delivery Agent`,`Delivery Note No`,`Delivery Note Date`,`Company Name`,`Product Description`,`Quantity`,`Customer Name and Address`,`Delivery Date`,`Status of Delivery`,`Emergency Delivery`,`Return to Warehouse` FROM customerdlvery.deliverydetails WHERE `Return to Warehouse` IN ('Yes') ";
	private static final String SELECT_PRODUCTS_BY_DATE = "SELECT `SI.No`,`Delivery Agent`,`Delivery Note No`,`Delivery Note Date`,`Company Name`,`Product Description`,`Quantity`,`Customer Name and Address`,`Delivery Date`,`Status of Delivery`,`Emergency Delivery`,`Return to Warehouse` FROM customerdlvery.deliverydetails WHERE `Delivery Date` BETWEEN ? AND ? ";
	private static final String SELECT_PRODUCTS_BY_DELIVERY_NOTENO = "SELECT `SI.No`,`Delivery Agent`,`Delivery Note No`,`Delivery Note Date`,`Company Name`,`Product Description`,`Quantity`,`Customer Name and Address`,`Delivery Date`,`Status of Delivery`,`Emergency Delivery`,`Return to Warehouse` FROM customerdlvery.deliverydetails WHERE `Delivery Note No` = ?";
	private static final String SELECT_PENDING_DELIVERY = "SELECT `SI.No`,`Delivery Agent`,`Delivery Note No`,`Delivery Note Date`,`Company Name`,`Product Description`,`Quantity`,`Customer Name and Address`,`Delivery Date`,`Status of Delivery`,`Emergency Delivery`,`Return to Warehouse` FROM customerdlvery.deliverydetails WHERE `Status of Delivery` IN ('Pending') ";

	
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
	
	public void insertproduct(DeliveryProductBean delbean) throws SQLException
	{
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(INSERT_PRODUCTS_SQL))
		{
			preparedStatement.setInt(1, delbean.getsINo());
			preparedStatement.setString(2, delbean.getDeliveryAgent());
			preparedStatement.setInt(3, delbean.getDeliveryNoteNo());
			preparedStatement.setString(4, delbean.getDeliveryNoteDate());
			preparedStatement.setString(5, delbean.getCompanyName());
			preparedStatement.setString(6, delbean.getProductDescription());
			preparedStatement.setInt(7, delbean.getQuantity());
			preparedStatement.setString(8, delbean.getCustomerNameandAddress());
			preparedStatement.setString(9, delbean.getDeliveryDate());
			preparedStatement.setString(10, delbean.getStatusofDelivery());
			preparedStatement.setString(11, delbean.getEmergencyDelivery());
			preparedStatement.setString(12, delbean.getReturntoWarehouse());
			
			preparedStatement.executeUpdate();
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<DeliveryProductBean> selectAllproducts() throws SQLException
	{
		List<DeliveryProductBean> delbean = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_ALL_PRODUCTS))
		{
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				delbean.add(new DeliveryProductBean(sINo, deliveryAgent, deliveryNoteNo, deliveryNoteDate,companyName,productDescription, quantity, customerNameandAddress, delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}
	
	public boolean updateProduct(DeliveryProductBean delbean) throws SQLException, ClassNotFoundException
	{
		boolean row_updated;
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(UPDATE_PRODUCTS_SQL))
		{
			preparedStatement.setInt(1, delbean.getsINo());
			preparedStatement.setString(2, delbean.getDeliveryDate());
			preparedStatement.setString(3, delbean.getStatusofDelivery());
			preparedStatement.setString(4, delbean.getEmergencyDelivery());
			preparedStatement.setString(5, delbean.getReturntoWarehouse());
			preparedStatement.setInt(6, delbean.getDeliveryNoteNo());
			
			row_updated = preparedStatement.executeUpdate()>0;
		}
		return row_updated;
	}
	
	public List<DeliveryProductBean> selectProductbystatus() throws SQLException
	{
		List<DeliveryProductBean> delbean = new ArrayList<DeliveryProductBean>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PRODUCTS_BY_STATUS))
		{
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				
				delbean.add(new DeliveryProductBean(sINo,deliveryAgent,deliveryNoteNo,deliveryNoteDate,companyName,productDescription,quantity,customerNameandAddress,delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}
	
	public List<DeliveryProductBean> selectReturntoWarehouse() throws SQLException
	{
		List<DeliveryProductBean> delbean = new ArrayList<DeliveryProductBean>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_RETURN_WAREHOUSE))
		{
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				
				delbean.add(new DeliveryProductBean(sINo,deliveryAgent,deliveryNoteNo,deliveryNoteDate,companyName,productDescription,quantity,customerNameandAddress,delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}
	
	public List<DeliveryProductBean> selectProductbyDate(String fromDate , String toDate) throws SQLException
	{
		List<DeliveryProductBean> delbean = new ArrayList<DeliveryProductBean>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PRODUCTS_BY_DATE))
		{
			preparedStatement.setString(1, fromDate);
			preparedStatement.setString(2, toDate);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				
				delbean.add(new DeliveryProductBean(sINo,deliveryAgent,deliveryNoteNo,deliveryNoteDate,companyName,productDescription,quantity,customerNameandAddress,delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}
	
	public DeliveryProductBean selectProductbydeliveryNoteNo(int deliveryNoteNo) throws SQLException
	{
		DeliveryProductBean delbean = null;
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PRODUCTS_BY_DELIVERY_NOTENO))
		{
			preparedStatement.setInt(1, deliveryNoteNo);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				
				delbean = new DeliveryProductBean(sINo,deliveryAgent,deliveryNoteNo,deliveryNoteDate,companyName,productDescription,quantity,customerNameandAddress,delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}
	
	public List<DeliveryProductBean> selectPendingDelivery() throws SQLException
	{
		List<DeliveryProductBean> delbean = new ArrayList<DeliveryProductBean>();
		try(Connection con = getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_PENDING_DELIVERY))
		{
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int sINo = rs.getInt("SI.No");
				String deliveryAgent = rs.getString("Delivery Agent");
				int deliveryNoteNo = rs.getInt("Delivery Note No");
				String deliveryNoteDate = rs.getString("Delivery Note Date");
				String companyName = rs.getString("Company Name");
				String productDescription = rs.getString("Product Description");
				int quantity = rs.getInt("Quantity");
				String customerNameandAddress = rs.getString("Customer Name and Address");
				String delievryDate = rs.getString("Delivery Date");
				String statusofDelivery = rs.getString("Status of Delivery");
				String emergencyDelivery = rs.getString("Emergency Delivery");
				String returntoWarehouse = rs.getString("Return to Warehouse");
				
				delbean.add(new DeliveryProductBean(sINo,deliveryAgent,deliveryNoteNo,deliveryNoteDate,companyName,productDescription,quantity,customerNameandAddress,delievryDate,statusofDelivery,emergencyDelivery,returntoWarehouse));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return delbean;
	}


	
	
}
