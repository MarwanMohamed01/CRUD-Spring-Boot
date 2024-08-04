package net.evaluation.ems_backend.mapper;

import net.evaluation.ems_backend.dto.EmployeeDto;
import net.evaluation.ems_backend.entity.employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto (employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static employee mapToEmployee(EmployeeDto employeeDto){
        return new employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
