package dam.kum.dissanayakaclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dam.kum.dissanayakaclinicbackend.dao.CategoryDAO;

@Controller
public class PageController {

	@Autowired
	public CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		//passing list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("UserClickedHome", true);
		
		return mv;
	}
	
	
	@RequestMapping(value = "about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("UserClickedAbout", true);
		
		return mv;
	}
	
	@RequestMapping(value ="contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("UserClickedContact", true);
		
		return mv;
	}
	
	
}
