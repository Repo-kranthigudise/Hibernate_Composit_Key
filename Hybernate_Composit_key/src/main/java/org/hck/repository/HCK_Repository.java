package org.hck.repository;

import org.hck.Entity.EmployeEntity;
import org.hck.Entity.EmployePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HCK_Repository extends JpaRepository<EmployeEntity, EmployePk>{

}
