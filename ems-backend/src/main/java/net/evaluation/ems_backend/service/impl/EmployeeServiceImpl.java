package net.evaluation.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import net.evaluation.ems_backend.dto.EmployeeDto;
import net.evaluation.ems_backend.entity.employee;
import net.evaluation.ems_backend.exception.ResourceNotFoundException;
import net.evaluation.ems_backend.mapper.EmployeeMapper;
import net.evaluation.ems_backend.repository.EmployeeRepository;
import net.evaluation.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {


        employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(long employeeId) {

        employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee doesn't exist with this id: " + employeeId ));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {

       List<employee> employees =  employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployee(Long employeeId) {

        employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee doesn't exist with this id: " + employeeId));

        employeeRepository.deleteById(employeeId);
    }
}
