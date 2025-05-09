package com.shawilTech.backend.repostory;

import com.shawilTech.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepostory extends JpaRepository<Employee, Long> {
}
