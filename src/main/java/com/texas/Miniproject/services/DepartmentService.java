package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Department;
import java.util.Optional;
import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> listAllDepartment();

    Optional<Department> getDepartmentById(Long id);

    void deleteDepartment(Long id);

    Department updateDepartment(Department department);
}
