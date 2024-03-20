package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Model.Emp;

@Repository
public class EmpDao {

	@Autowired
	JdbcTemplate stmt;

	public void insertEmp(Emp emp) {
		stmt.update("insert into emp (name,salary) values(?,?)", emp.getName(), emp.getSalary());
	}
	public List<Emp> getAllEmp() {
		return stmt.query("select * from emp", new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	@SuppressWarnings("deprecation")
	public Emp getEmpById(int id) {
		Emp emp = null;
		try {
			emp = stmt.queryForObject("select * from emp where id =?", new Object[] { id },
					new BeanPropertyRowMapper<Emp>(Emp.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	public boolean deleteEmp(int id) {

		int i = stmt.update("delete * from emp where id=?", id);
		if (i == 0) {
			return false;
		} else {
			return true;
		}
	}
	public int updateEmp(Emp emp) {
		return stmt.update("update emp set name=? , salary=? where id=?", emp.getName(), emp.getSalary(), emp.getId());
	}
}