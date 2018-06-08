package it.begear.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import it.begear.webapp.model.Utenti;

@Controller
public class MioController {
	
	//Request mapping mappa il percorso, l'url, in spring-web-servlet.xml, settiamo il InternalResourceViewResolver affinche in
	//una data directory ricerchi tutto ciò che si trova nella directory indicata con estensione .jsp.
	//Se cambio il nome nel return non trova la jsp che nel mio caso si chiama index.jsp.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String print(ModelMap model)  {
		model.addAttribute("attrib", "CIAO"); 	//Per leggere un messaggio nella index.jsp
		return "index";
	}
	
	@RequestMapping(value = "/micro", method = RequestMethod.GET)
	public @ResponseBody String getMicro() {
		System.out.println("Sono dentro");
		return "microservizio!";
	}
	
	@RequestMapping(value = "/utenti", method = RequestMethod.GET)
	@ResponseBody()
		public List<Utenti> getMicro2(){
			return this.getUtentiMock();
		}
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	private List<Utenti> getUtentiMock(){
		List list = new ArrayList<>();
		
		Utenti saverioz = new Utenti();
		saverioz.setId(1);
		saverioz.setName("Saverio Zangaro");
		saverioz.setCountry("Italia");
		list.add(saverioz);
		
		Utenti pippo = new Utenti();
		pippo.setId(2);
		pippo.setName("Pippo Pippo");
		pippo.setCountry("America");
		list.add(pippo);
		
		return list;
	}
	
	public ModelAndView hello(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("msg", name);		
		return model;
	}

}