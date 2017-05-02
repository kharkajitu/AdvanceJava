package com.cubic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
@NamedQueries({
	@NamedQuery(name="QueryConstants.PRODUCT_SEARCH_BY_NAME", query = "select c from ProductEntity c where UPPER(c.productName) like UPPER(:c1)"),
	@NamedQuery(name="QueryConstants.PRODUCT_SEARCH_BY_NUMBER", query = "select c from ProductEntity c where c.productNumber like (:c2)"),
	@NamedQuery(name="QueryConstants.PRODUCT_SEARCH_BY_UPC", query = "select c from ProductEntity c where UPPER(c.productUpc) like UPPER(:c3)"),
	@NamedQuery(name="QueryConstants.PRODUCT_SEARCH_BY_CATAGORY", query = "select c from ProductEntity c where UPPER(c.productCatagory) like UPPER(:c4)"),
	@NamedQuery(name="QueryConstants.PRODUCT_SEARCH_BY_MANUFACTURE", query = "select c from ProductEntity c where UPPER(c.productManufac) like UPPER(:c5)")
})
public class ProductEntity {
	
	@Id
	@Column(name="PROD_ID")
	@SequenceGenerator(name = "prodSeq", sequenceName = "SEQ_TEST", allocationSize = 1)
	@GeneratedValue(generator = "prodSeq")
	private Long productId;
	
	@Column(name="PROD_NAME")
	private String productName;
	
	@Column(name="PROD_NUMBER")
	private Long productNumber;
	
	@Column(name="PROD_DESC")
	private String productDesc;
	
	@Column(name="PROD_UPC")
	private String productUpc;
	
	@Column(name="PROD_CAT")
	private String productCatagory;
	
	@Column(name="PROD_MFD")
	private String productManufac;
	
	@Column(name="PROD_VSN")
	private String productVersion;
	
	@Column(name="ACTIVE_DATE")
	private Date activeDate;
	
	@Column(name="INACTIVE_DATE")
	private Date inactiveDate;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="PROD_QTY")
	private Long productQuantity;
	
	@Column(name="THRESHOLD_QTY")
	private Long thresholdQuantity;
	
	@Column(name="ORDERED_QTY")
	private Long orderedQuantity;
	
	@Column(name="PROD_PRICE")
	private Float productPrice;
	
	
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
