package org.hck.controler;

import java.util.List;

import org.hck.Entity.EmployeEntity;
import org.hck.services.HCKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HCK_Employe_Controler {
	
	@Autowired
	private HCKService hCKService;
	
	@RequestMapping(method = RequestMethod.POST,value="/add")
	public EmployeEntity saveEmp(@RequestBody EmployeEntity entity) {
		return hCKService.save(entity);
	}
	@RequestMapping("/emp")
	public List<EmployeEntity> getEmp(){
		return hCKService.getemp();
	}
	
	@RequestMapping("/h")
	public String hello() {
		return "hello";
	}
	
}
