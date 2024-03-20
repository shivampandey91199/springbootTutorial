package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dao.empDao;
import com.user.Response;
import com.user.emp;

@RestController
public class empController {

	@Autowired
	empDao dao;

	@PostMapping("/emp")
	public Response<emp> insertEmp(@RequestBody emp emp1) {
		dao.insertEmp(emp1);
		return Response.getData(emp1, "emp inserted successfully", 200);
	}

	@GetMapping("/empls")
	public Response<List<emp>> getAllEmp() {
		return Response.getData(dao.getAllEmp(), "Emp List Retrived", 200);
	}

	@DeleteMapping("/deleteEmp/{empId}")
	public Response<?> deleteEmpById(@PathVariable("empId") int empId) {
		if (dao.deleteEmpById(empId) == true) {
			return Response.getData(null, "Emp Deleted", 200);
		} else {
			return Response.getData(null, "Invalid EmpID", -1);
		}
	}
	@PutMapping("/emps")
	public Response<emp> updateEmp(@RequestBody emp emp) {
		if (dao.updateEmp(emp) != 0) {
			return Response.getData(emp, "Emp Update", 200);
		}
		return Response.getData(emp, "invalid emp", -1);
	}

	@GetMapping("/emp/{empId}")
	public Response<emp> getEmpById(@PathVariable("empId") int empId) {
		emp e = dao.getEmpById(empId);
		if (e == null) {
			return Response.getData(e, "Invalid emp ID ", -1);
		} else {
			return Response.getData(e, "Emp Successfully Retrived", 200);
		}
	}
}
