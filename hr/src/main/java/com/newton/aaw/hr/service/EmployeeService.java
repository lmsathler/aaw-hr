package com.newton.aaw.hr.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.exception.NotFoundException;

@Service
public class EmployeeService {

	private static int id = 0;
	private Map<Integer, Employee> users = new HashMap<Integer, Employee>();

	public Employee create(Employee u) {
		u.setId(++id);
		users.put(id, u);

		return u;
	}

	public Employee update(Integer id, Employee u) {
		var existing = get(id);

		return existing;
	}

	public Employee get(Integer id) {

		var user = users.get(id);

		if (user == null) {
			throw new NotFoundException("User with ID " + id + " not found");
		}

		return user;
	}

	public List<Employee> getAll() {
		return new ArrayList<>(users.values());
	}

	public void delete(Integer id) {

		get(id);

		users.remove(id);
	}

}
