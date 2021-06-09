package org.weblearner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="salary_account")
public class SalaryAccount {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "account_no", nullable = false)
	private Integer accountNo;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@OneToOne
	@JoinColumn(name="staff_id")
	private Staff staff;
	
	
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	@Override
	public String toString() {
		return "SalaryAccount [accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", staff=" + staff + "]";
	}
	
	public SalaryAccount(String ifscCode, Staff staff) {
		super();
		
		this.ifscCode = ifscCode;
		this.staff = staff;
	}
	
	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
