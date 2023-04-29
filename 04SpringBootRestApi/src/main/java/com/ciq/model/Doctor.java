package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer did;
	@Column
	private String dname;
	@Column
	private Double dfee;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer did, String dname, Double dfee) {
		super();
		this.did = did;
		this.dname = dname;
		this.dfee = dfee;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Double getDfee() {
		return dfee;
	}
	public void setDfee(Double dfee) {
		this.dfee = dfee;
	}
	@Override
	public String toString() {
		return "Docter [did=" + did + ", dname=" + dname + ", dfee=" + dfee + "]";
	}
	
	
	

}
