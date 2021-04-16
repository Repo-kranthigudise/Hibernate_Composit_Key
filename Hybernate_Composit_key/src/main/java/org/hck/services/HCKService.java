package org.hck.services;

import java.util.ArrayList;

import java.util.List;

import org.hck.Entity.EmployeEntity;
import org.hck.repository.HCK_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HCKService {

	@Autowired
	private HCK_Repository hck_Repository;
	
	public EmployeEntity save(EmployeEntity entity) {
		return hck_Repository.save(entity);
	}

	public List<EmployeEntity> getemp() {
		List<EmployeEntity> lis=new ArrayList<>();
		hck_Repository.findAll().forEach(lis::add);
		return lis;
		
	}

}
