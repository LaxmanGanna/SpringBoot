package com.ciq.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Laptop {
	
	private Integer lid;
	
	private String lname;
	
	private double lprice;

//	public Laptop() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Laptop(int lid, String lname, double lprice) {
//		super();
//		this.lid = lid;
//		this.lname = lname;
//		this.lprice = lprice;
//	}
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	public double getLprice() {
//		return lprice;
//	}
//	public void setLprice(double lprice) {
//		this.lprice = lprice;
//	}
//	
//	@Override
//	public String toString() {
//		return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
//	}
//	public static void main(String[] args) {
//		Laptop l = new Laptop(0, null, 0);
//
//	}

}
