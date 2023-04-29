package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employ {
	@Id
	private int Uid;
	@Column
	private String Uname;
	@Column
	private String pass;
	
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employ(int uid, String uname, String pass) {
		super();
		Uid = uid;
		Uname = uname;
		this.pass = pass;
	}

	public int getUid() {
		return Uid;
	}

	public String getUname() {
		return Uname;
	}

	public String getPass() {
		return pass;
	}
	

	public void setUid(int uid) {
		Uid = uid;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Employ [Uid=" + Uid + ", Uname=" + Uname + ", pass=" + pass + "]";
	}
	
	

}
