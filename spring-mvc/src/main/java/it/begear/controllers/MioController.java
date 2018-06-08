package it.begear.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.begear.model.Utente;

@Controller
public class MioController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String print(ModelMap model)  {
		model.addAttribute("message","Ciao come stai?");
		return "index";

	}

	@RequestMapping(value="/micro", method = RequestMethod.GET)
	public @ResponseBody String getMicro() {
		return "pippo";
	}

	@RequestMapping(value="/microutenti", method = RequestMethod.GET)
	@ResponseBody() public List<Utente> getMicroUtenti() {
		return this.addList();
	}

	private List<Utente> addList(){
		List<Utente> lista=new ArrayList<>();
		Utente ut1=new Utente("Franco","Rossi",24);
		lista.add(ut1);
		Utente ut2=new Utente("Luigi","Biano",56);
		lista.add(ut2);
		Utente ut3=new Utente("Mario","Giallo",78);
		lista.add(ut3);
		return lista;

	}

}
