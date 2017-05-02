package com.cubic.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductVO {
	
	private Long productId;
	private String productName;
	private Long productNumber;	
	private String productDesc;
	private String productUpc;
	private String productCatagory;
	private String productManufac;
	private String productVersion;
	private Date activeDate;
	private Date inactiveDate;
	private Date createdDate;
	private Long productQuantity;
	private Long thresholdQuantity;
	private Long orderedQuantity;
	private Float productPrice;
	private boolean activeStatus;
	
	
	public boolean isActiveStatus() {
		return activeStatus;
	}


	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Long getProductNumber() {
		return productNumber;
	}


	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public String getProductUpc() {
		return productUpc;
	}


	public void setProductUpc(String productUpc) {
		this.productUpc = productUpc;
	}


	public String getProductCatagory() {
		return productCatagory;
	}


	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}


	public String getProductManufac() {
		return productManufac;
	}


	public void setProductManufac(String productManufac) {
		this.productManufac = productManufac;
	}


	public String getProductVersion() {
		return productVersion;
	}


	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}


	public Date getActiveDate() {
		return activeDate;
	}


	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}


	public Date getInactiveDate() {
		return inactiveDate;
	}


	public void setInactiveDate(Date inactiveDate) {
		this.inactiveDate = inactiveDate;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Long getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}


	public Long getThresholdQuantity() {
		return thresholdQuantity;
	}


	public void setThresholdQuantity(Long thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}


	public Long getOrderedQuantity() {
		return orderedQuantity;
	}


	public void setOrderedQuantity(Long orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}


	public Float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

}
