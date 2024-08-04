package net.evaluation.ems_backend.service;

import net.evaluation.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee (EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(long EmployeeId);

    List<EmployeeDto> getAllEmployees();

    void deleteEmployee(Long employeeId);
}
