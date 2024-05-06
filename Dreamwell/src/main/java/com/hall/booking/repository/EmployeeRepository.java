package com.hall.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hall.booking.model.Employee;

 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
