package com.example.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Student student) {
		String s = "insert into student values(?,?,?)";
		Object[] s1 = { student.getSid(), student.getSname(), student.getSfee() };
		System.out.println(s1);
		jdbcTemplate.update(s, s1);

	}

	@Override
	public List<Student> listOfStudents() {

		return jdbcTemplate.query("select*from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setSid(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setSfee(rs.getDouble(3));
				return s;
			}

		});
	}

	@Override
	public int delete(int sid) {
		String d = "delete from student where sid=?";
		Object[] o = { sid };
		int dele = jdbcTemplate.update(d, o);

		return dele;
	}

	@Override
	public Student getById(int sid) {
		String s5 = "select *from student where sid=?";
		Object[] o1 = { sid };
		return jdbcTemplate.queryForObject(s5, o1, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setSid(rs.getInt(sid));
				return s;
			}
		});
	}

	@Override
	public int update(Student student) {
		String update = "update student set sname=?,sfee=? where sid=?";
		Object[] a = { student.getSname(), student.getSfee(), student.getSid() };
		return jdbcTemplate.update(update, a);
	}
}
