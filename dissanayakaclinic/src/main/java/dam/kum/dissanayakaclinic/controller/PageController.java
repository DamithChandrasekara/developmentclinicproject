package dam.kum.dissanayakaclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
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
