package net.evaluation.ems_backend.repository;

import net.evaluation.ems_backend.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee, Long> {
}
