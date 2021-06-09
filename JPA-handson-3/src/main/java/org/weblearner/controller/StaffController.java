package org.weblearner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.weblearner.model.Staff;
import org.weblearner.service.StaffService;


@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showPage(Model model) {
		model.addAttribute("staff", new Staff());
		return "register";
	//return register.jsp page. Add the //instance of staff to Model instance.
	}
	
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public ModelAndView processPage(@ModelAttribute("staff")Staff staff) {
		
	// invoke proper method from service layer to save the record into the table.
		System.out.println("hii");
		ModelAndView mv= new ModelAndView();
		if(staffService.saveRecord(staff)) {
			mv.addObject("message", "Saved");
		}
		else {
			mv.addObject("message","not saved");
		}
		
		mv.setViewName("register");
		return mv;
	}

}
