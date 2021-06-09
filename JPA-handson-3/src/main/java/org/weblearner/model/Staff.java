package org.weblearner.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="staff")
public class Staff {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="staff_id",nullable=false)
	private Integer id;
	
	private String name;
	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="joining_date")
	private LocalDate joiningDate;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="staff")
	private SalaryAccount salaryAccount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public SalaryAccount getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(SalaryAccount salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	public Staff(Integer id, String name, String email, LocalDate joiningDate, SalaryAccount salaryAccount) {
		super();
		this.name = name;
		this.email = email;
		this.joiningDate = joiningDate;
		
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", email=" + email + ", joiningDate=" + joiningDate
				+ ", salaryAccount=" + salaryAccount + "]";
	}
	
	 
	
}
