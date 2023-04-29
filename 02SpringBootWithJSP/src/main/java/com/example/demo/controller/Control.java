package com.example.demo.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployServiceImpl;

@RestController
public class Control {
	@Autowired
	private EmployServiceImpl esi;

	@GetMapping("/save")
	public ModelAndView laxman() {
		return new ModelAndView("Insert");
	}

	@PostMapping("/rt")
	public ModelAndView ram(Employ employ) {
		esi.save(employ);
		return new ModelAndView("redirect:all");
	}

	@GetMapping("/all")
	public ModelAndView all() {
		List<Employ> list = esi.listOfEmployies();

		return new ModelAndView("findall", "lam", list);
	}
	@GetMapping("/edit")
	public ModelAndView edit(int Uid) {
		Employ em=esi.findById(Uid);
		return new ModelAndView("Edit","lan",em);
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(Employ employ) {
		esi.delete(employ);
		return new ModelAndView("redirect:all");
	}
	@GetMapping("/update")
	public ModelAndView modify(Employ employ) {
		esi.update(employ);
		return new ModelAndView("redirect:all");
		
	}

}
