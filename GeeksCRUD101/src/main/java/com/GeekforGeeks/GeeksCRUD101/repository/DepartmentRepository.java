package com.GeekforGeeks.GeeksCRUD101.repository;

import com.GeekforGeeks.GeeksCRUD101.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
