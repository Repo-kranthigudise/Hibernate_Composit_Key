package org.hck.repository;

import org.hck.Entity.EmployeEntity;
import org.hck.Entity.EmployePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HCK_Repository extends JpaRepository<EmployeEntity, EmployePk> {

}
