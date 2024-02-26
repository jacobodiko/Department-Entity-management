package com.GeekforGeeks.GeeksCRUD101.controller;


import com.GeekforGeeks.GeeksCRUD101.entity.Department;
import com.GeekforGeeks.GeeksCRUD101.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Annotation
@RestController
public class DepartmentController {
    //Annotation
    @Autowired
    private DepartmentService departmentService;

    //Save Operation
    @PostMapping("/departments")
    public Department saveDepartment(Department department) {
        return departmentService.saveDepartment(department);
    }

    //Read Operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();

    }
    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
}
