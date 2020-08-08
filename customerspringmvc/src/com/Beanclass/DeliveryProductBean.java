package com.Beanclass;

public class DeliveryProductBean {
	
	private int sINo;
	private String deliveryAgent;
	private int deliveryNoteNo;
	private String deliveryNoteDate;
	private String companyName;
	private String productDescription;
	private int quantity;
	private String customerNameandAddress;
	private String deliveryDate;
	private String statusofDelivery;
	private String emergencyDelivery;
	private String returntoWarehouse;
	
	private String fromDate;
	private String toDate;
	
	public DeliveryProductBean() {
		super();
	}
	
	public DeliveryProductBean(int sINo, String deliveryAgent, int deliveryNoteNo, String deliveryNoteDate,
			String companyName, String productDescription, int quantity, String customerNameandAddress,
			String deliveryDate, String statusofDelivery, String emergencyDelivery, String returntoWarehouse) {
		super();
		this.sINo = sINo;
		this.deliveryAgent = deliveryAgent;
		this.deliveryNoteNo = deliveryNoteNo;
		this.deliveryNoteDate = deliveryNoteDate;
		this.companyName = companyName;
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.customerNameandAddress = customerNameandAddress;
		this.deliveryDate = deliveryDate;
		this.statusofDelivery = statusofDelivery;
		this.emergencyDelivery = emergencyDelivery;
		this.returntoWarehouse = returntoWarehouse;
	}
	
	public int getsINo() {
		return sINo;
	}
	public void setsINo(int sINo) {
		this.sINo = sINo;
	}
	public String getDeliveryAgent() {
		return deliveryAgent;
	}
	public void setDeliveryAgent(String deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}
	public int getDeliveryNoteNo() {
		return deliveryNoteNo;
	}
	public void setDeliveryNoteNo(int deliveryNoteNo) {
		this.deliveryNoteNo = deliveryNoteNo;
	}
	public String getDeliveryNoteDate() {
		return deliveryNoteDate;
	}
	public void setDeliveryNoteDate(String deliveryNoteDate) {
		this.deliveryNoteDate = deliveryNoteDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCustomerNameandAddress() {
		return customerNameandAddress;
	}
	public void setCustomerNameandAddress(String customerNameandAddress) {
		this.customerNameandAddress = customerNameandAddress;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatusofDelivery() {
		return statusofDelivery;
	}
	public void setStatusofDelivery(String statusofDelivery) {
		this.statusofDelivery = statusofDelivery;
	}
	public String getEmergencyDelivery() {
		return emergencyDelivery;
	}
	public void setEmergencyDelivery(String emergencyDelivery) {
		this.emergencyDelivery = emergencyDelivery;
	}
	public String getReturntoWarehouse() {
		return returntoWarehouse;
	}
	public void setReturntoWarehouse(String returntoWarehouse) {
		this.returntoWarehouse = returntoWarehouse;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	

}
