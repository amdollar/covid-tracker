package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class AssestmentForm {
	private int assestmentId;
	private int userid;
	private String[] sympotms;
	private boolean history;
	private boolean contacted;

	public int getAssestmentId() {
		return assestmentId;
	}

	public void setAssestmentId(int assestmentId) {
		this.assestmentId = assestmentId;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String[] getSympotms() {
		return sympotms;
	}

	public void setSympotms(String[] sympotms) {
		this.sympotms = sympotms;
	}

	public boolean isHistory() {
		return history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

	public boolean isContacted() {
		return contacted;
	}

	public void setContacted(boolean contacted) {
		this.contacted = contacted;
	}

}
