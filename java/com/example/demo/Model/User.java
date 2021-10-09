package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private int userid;
	private String fullname;
	private int pincode;
	private long phoneno;

	public User() {
	}

	public User(int userid, String username, int pincode, long phoneno) {
		super();
		this.userid = userid;
		this.fullname = username;
		this.pincode = pincode;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + fullname + ", pincode=" + pincode + ", phoneno=" + phoneno
				+ "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String username) {
		this.fullname = username;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

}
