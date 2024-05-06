package com.hall.booking.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.hall.booking.model.Customer;
import com.hall.booking.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	void saveCustomer(Customer customer);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
