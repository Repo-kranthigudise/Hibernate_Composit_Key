package org.hck.controler;

import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.hck.Entity.EmployeEntity;
import org.hck.services.HCKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HCK_Employe_Controler {
	
	
	@Autowired
	private HCKService hCKService;
	@RequestMapping("/esave")
    @PostMapping
	public EmployeEntity save(@RequestBody EmployeEntity entity) {
		return hCKService.save(entity);
	}
	/*
	 * public List<EmployeEntity> getEmp(){ return }
	 */

}
