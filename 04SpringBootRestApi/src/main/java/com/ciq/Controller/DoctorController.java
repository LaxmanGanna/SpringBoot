package com.ciq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Doctor;
import com.ciq.service.DoctorSeviceImpl;
@Controller
public class DoctorController {
	@Autowired
	private DoctorSeviceImpl dsi;
	
	@GetMapping("/get")
	public ModelAndView save() {
		return new ModelAndView("insert");
	}
	@PostMapping("/laxman")
	public String inserted(Doctor doctor) {
		dsi.save(doctor);
		return "redirect:all";
	}
	@GetMapping("/all")
	public ModelAndView findall(Doctor doctor) {
		List<Doctor> doc=dsi.findall(doctor);
		return new ModelAndView("findall","lan",doc);
	}
	@PostMapping("/update")
	public ModelAndView getById(Integer did) {
	Doctor doc=dsi.getById(did);
		return new ModelAndView("update","sw",doc);
	}
	@GetMapping("/ram")
	public ModelAndView update(Doctor doctor) {
		Doctor doc = dsi.update(doctor);
		return new ModelAndView("redirect:all");
		
	}
	@GetMapping("/delete")
	public ModelAndView delete(Doctor doctor) {
		dsi.delete(doctor);
		return new ModelAndView("redirect:all");
		
	}

}
