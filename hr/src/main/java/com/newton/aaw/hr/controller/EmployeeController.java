package com.newton.aaw.hr.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newton.aaw.hr.api.EmployeeDTO;
import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.service.EmployeeService;

@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees/{id}")
	public EmployeeDTO getById(@PathVariable Integer id) {
		var user = employeeService.get(id);

		return new EmployeeDTO(user);
	}

	@GetMapping("/employees")
	public ArrayList<EmployeeDTO> getAll() {
		var users = employeeService.getAll();

		var employeeDTO = new ArrayList<EmployeeDTO>();

		for (var user : users) {
			employeeDTO.add(new EmployeeDTO(user));
		}

		return employeeDTO;
	}

	@PostMapping("/employees")
	public EmployeeDTO create(@RequestBody EmployeeDTO u) {
		var user = new Employee(u);

		user = employeeService.create(user);

		return new EmployeeDTO(user);
	}

	@PutMapping("/employee/{id}")
	public EmployeeDTO update(@PathVariable Integer id, @RequestBody EmployeeDTO u) {
		var user = new Employee(u);

		user = employeeService.update(id, user);

		return new EmployeeDTO(user);
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		employeeService.delete(id);

		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
