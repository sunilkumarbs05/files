package com.sunil.example.hibernateExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunil.example.hibernateExample.dto.StudentInfoDto;
import com.sunil.example.hibernateExample.service.StudentInfoService;

@Controller
public class StudentInfoController {

	@Autowired
	StudentInfoService studentInfoService;

	@RequestMapping(value = "/getStudentInfo/{id}")
	@ResponseBody
	public StudentInfoDto getStudentInfo(@PathVariable("id") int StudentId) {
		return studentInfoService.getStudentInfo(StudentId);

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	
	public @ResponseBody String save(@RequestBody StudentInfoDto studentInfo) {
		studentInfoService.save(studentInfo.getName(), studentInfo.getEmail(),
				studentInfo.getAge());

		return "Successfully Updated";

	}

	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("message", "Hello How are you");
		return modelAndView;
	}
}
