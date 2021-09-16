package com.newton.aaw.hr.domain.entity;

import java.time.LocalDate;

import com.newton.aaw.hr.api.EmployeeDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer id;

	private Gender gender;

	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

	private LocalDate startDate;

	private LocalDate endDate;

	private String position;

	private Float monthlySalary;

	private Float hourSalary;

	private String area;

	public Employee(EmployeeDTO employeeDTO) {
		this.id = employeeDTO.getId();
		this.firstName = employeeDTO.getFirstName();
		this.lastName = employeeDTO.getLastName();
		this.dateOfBirth = employeeDTO.getDateOfBirth();
		this.startDate = employeeDTO.getStartDate();
		this.endDate = employeeDTO.getEndDate();
		this.position = employeeDTO.getPosition();
		this.monthlySalary = employeeDTO.getMonthlySalary();
		this.hourSalary = employeeDTO.getHourSalary();
		this.area = employeeDTO.getArea();
	}
}
