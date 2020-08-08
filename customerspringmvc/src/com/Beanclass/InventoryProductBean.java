package com.Beanclass;

public class InventoryProductBean {

	private int sINo;
	private String companyName;
	private int productCode;
	private String productDescription;
	private int quantity;
	private String pricePerUnit;
	private String totalPrice;
	private String movedInDate;
	private int movedIn;
	private String movedOutDate;
	private int movedOut;
	private int deliveryNoteNo;
	private String deliveryAgent;
	private int balanceQuantity;
	private String conditionoftheProduct;
	private String fromDate;
	private String toDate;
	
	
	public InventoryProductBean()  {
		super();
	}



	public InventoryProductBean(int sINo, String companyName, int productCode, String productDescription, int quantity,
			String pricePerUnit, String totalPrice, String movedInDate, int movedIn, String movedOutDate, int movedOut,int deliveryNoteNo,String deliveryAgent,
			int balanceQuantity, String conditionoftheProduct) {
		super();
		this.sINo = sINo;
		this.companyName = companyName;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.movedInDate = movedInDate;
		this.movedIn = movedIn;
		this.movedOutDate = movedOutDate;
		this.movedOut = movedOut;
		this.deliveryNoteNo=deliveryNoteNo;
		this.deliveryAgent=deliveryAgent;
		this.balanceQuantity = balanceQuantity;
		this.conditionoftheProduct = conditionoftheProduct;
	}



	public int getsINo() {
		return sINo;
	}



	public void setsINo(int sINo) {
		this.sINo = sINo;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public int getProductCode() {
		return productCode;
	}



	public void setProductCode(int productCode) {
		this.productCode = productCode;
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



	public String getPricePerUnit() {
		return pricePerUnit;
	}



	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}



	public String getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getMovedInDate() {
		return movedInDate;
	}



	public void setMovedInDate(String movedInDate) {
		this.movedInDate = movedInDate;
	}



	public int getMovedIn() {
		return movedIn;
	}



	public void setMovedIn(int movedIn) {
		this.movedIn = movedIn;
	}



	public String getMovedOutDate() {
		return movedOutDate;
	}



	public void setMovedOutDate(String movedOutDate) {
		this.movedOutDate = movedOutDate;
	}



	public int getMovedOut() {
		return movedOut;
	}



	public void setMovedOut(int movedOut) {
		this.movedOut = movedOut;
	}



	public int getDeliveryNoteNo() {
		return deliveryNoteNo;
	}



	public void setDeliveryNoteNo(int deliveryNoteNo) {
		this.deliveryNoteNo = deliveryNoteNo;
	}



	public String getDeliveryAgent() {
		return deliveryAgent;
	}



	public void setDeliveryAgent(String deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}



	public int getBalanceQuantity() {
		return balanceQuantity;
	}



	public void setBalanceQuantity(int balanceQuantity) {
		this.balanceQuantity = balanceQuantity;
	}



	public String getConditionoftheProduct() {
		return conditionoftheProduct;
	}



	public void setConditionoftheProduct(String conditionoftheProduct) {
		this.conditionoftheProduct = conditionoftheProduct;
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

