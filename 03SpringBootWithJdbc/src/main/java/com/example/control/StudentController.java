package com.example.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.StudentDaoImpl;
import com.example.model.Student;
import com.example.service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl ssi;
	
	@GetMapping("/save")
	
	public ModelAndView Home() {
		return new ModelAndView("insert");
	}
		
	@PostMapping("/rt")
	public String save(Student student) {
		ssi.save(student);
		return "redirect:getall";
		
	}
	@GetMapping("/getall")
	public ModelAndView findall(Student student){
		List<Student> std=ssi.listOfStudents();
		return new ModelAndView("findall","map",std);
		
	}
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam int sid) {
		ssi.delete(sid);
		return new ModelAndView("redirect:getall");
		
	} 
	@GetMapping("/up")
	public ModelAndView getById(@RequestParam int sid) {
		Student s=ssi.getById(sid);
		System.out.println(s);
		return new ModelAndView("Update","ram",s);
		
	}
	@PostMapping("/update1")
	public ModelAndView update(Student student) {
		ssi.update(student);
		return new ModelAndView("redirect:getall");
	}
	
}
