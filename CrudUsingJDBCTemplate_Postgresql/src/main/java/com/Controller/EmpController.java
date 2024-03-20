package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dao.EmpDao;
import com.Model.Emp;

@RestController
public class EmpController {

	@Autowired
	EmpDao dao;

	@PostMapping("/insert")
	public Emp SaveEmp(Emp emp) {
		dao.insertEmp(emp);
		return emp;
	}

	@GetMapping("/getAllUSer")
	public List<Emp> getAllEmp() {
		return dao.getAllEmp();
	}

	@GetMapping("/Emp/{id}")
	public Emp getEmpById(@PathVariable("id") int id) {
		Emp emp = dao.getEmpById(id);
		if (emp == null) {
			return emp;
		} else {
			return emp;
		}
	}

	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmpById(@PathVariable("id") int id) {
		if (dao.deleteEmp(id) == true) {
			return "Emp deleted";
		} else {
			return "Invalid Emp ID";
		}
	}

	@PutMapping("/update")
	public Emp updateEmp(Emp emp) {
		if (dao.updateEmp(emp) != 0) {
			return emp;
		} else {
			return emp;
		}
	}
}

