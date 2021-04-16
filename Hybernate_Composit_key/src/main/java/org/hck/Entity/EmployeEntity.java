package org.hck.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="emp_db")



@IdClass(EmployePk.class)
public class EmployeEntity {
	@Id
	private int eId;
	@Id
	private int dId;
	private String eName;
	private String email;
	private String eRole;
	
	public EmployeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeEntity(int eId, int dId, String eName, String email, String eRole) {
		super();
		this.eId = eId;
		this.dId = dId;
		this.eName = eName;
		this.email = email;
		this.eRole = eRole;
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	

}
