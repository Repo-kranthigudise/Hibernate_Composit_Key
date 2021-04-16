package org.hck.Entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class EmployePk implements Serializable{
	private int eId;
	private int dId;
	
	public EmployePk(int eId, int dId) {
		super();
		this.eId = eId;
		this.dId = dId;
	}
	public EmployePk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}

}
