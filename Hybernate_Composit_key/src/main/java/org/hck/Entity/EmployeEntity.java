package org.hck.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_db")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(EmployePk.class)
public class EmployeEntity {
	@Id
	private int eId;
	@Id
	private int dId;
	private String eName;
	private String email;
	private String eRole;
	

}
