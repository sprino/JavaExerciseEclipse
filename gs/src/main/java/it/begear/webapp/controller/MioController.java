package it.begear.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MioController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String print(ModelMap model)  {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}
	
	@RequestMapping(value = "/micro", method = RequestMethod.GET)
	public @ResponseBody String getMicro() {
		System.out.println("Sono dentro");
		return "pippo";
	}
//	public ModelAndView hello(@PathVariable("name") String name) {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("index");
//		model.addObject("msg", name);
//		
//		return model;
//	}

}