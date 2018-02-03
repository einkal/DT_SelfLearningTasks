package com.niit.amkart.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="SUPPLIER")
@Component
public class Supplier {
	@Id
	private String supplierID;
	private String supplierName;
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public String getsupplierName() {
		return supplierName;
	}
	public void setsupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	

}
