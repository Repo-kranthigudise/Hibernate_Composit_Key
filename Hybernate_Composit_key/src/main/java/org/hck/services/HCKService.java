package org.hck.services;

import org.hck.Entity.EmployeEntity;
import org.hck.repository.HCK_Repository;
import org.springframework.beans.factory.annotation.Autowired;

public class HCKService {

	@Autowired
		private HCK_Repository hck_Repository;
	
	public EmployeEntity save(EmployeEntity entity) {
		return hck_Repository.save(entity);
	}

}
