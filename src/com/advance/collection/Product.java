package com.advance.collection;

public class Product {

	private int productID;
	private String productName;
	private int productQuantity;
	private int productPrice;
	private String mfgDate;
	private String expDate;
	
	public Product() {
		super();
	}


	public Product(int productID, String productName, int productQuantity, int productPrice, String mfgDate,
			String expDate) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public String getMfgDate() {
		return mfgDate;
	}


	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate
				+ "]";
	}
	
	
	
}
