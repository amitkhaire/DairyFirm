package com.shubhamdairy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custId;
	
	private String fristName;
	private String lastName;
	private long mobileNumber;
	private String permanentAddress;
	private String email;
	private String adharard;
	private String pancard;
	private String milkType;
	private String regDate;
	private String updatedDate;
	private float depositeAmount;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdharard() {
		return adharard;
	}

	public void setAdharard(String adharard) {
		this.adharard = adharard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public float getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(float depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	@Override
	public String toString() {
		return "CustomerEntity [custId=" + custId + ", fristName=" + fristName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", permanentAddress=" + permanentAddress + ", email=" + email
				+ ", adharard=" + adharard + ", pancard=" + pancard + ", milkType=" + milkType + ", regDate=" + regDate
				+ ", updatedDate=" + updatedDate + ", depositeAmount=" + depositeAmount + "]";
	}

}
