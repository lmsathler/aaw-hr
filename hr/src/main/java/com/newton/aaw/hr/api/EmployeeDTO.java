package com.newton.aaw.hr.api;

import java.time.LocalDate;

import com.newton.aaw.hr.domain.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

	private Integer id;

	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

	private LocalDate startDate;

	private LocalDate endDate;

	private String position;

	private Float monthlySalary;

	private Float hourSalary;

	private String area;

	public EmployeeDTO(Employee e) {
		this.id = e.getId();
		this.firstName = e.getFirstName();
		this.lastName = e.getLastName();
		this.dateOfBirth = e.getDateOfBirth();
		this.startDate = e.getStartDate();
		this.endDate = e.getEndDate();
		this.position = e.getPosition();
		this.monthlySalary = e.getMonthlySalary();
		this.hourSalary = e.getHourSalary();
		this.area = e.getArea();
	}
}
