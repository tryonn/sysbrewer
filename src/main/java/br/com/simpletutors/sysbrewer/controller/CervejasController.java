package br.com.simpletutors.sysbrewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.simpletutors.sysbrewer.model.Cerveja;
 
@Controller
public class CervejasController {
	
	
	// se for um get chama esse
	@RequestMapping("/cervejas/novo")
	public String novo(){
		return "cerveja/CadastroCerveja";
	}
	
	
	// se for um post chama esse
	@RequestMapping(value = "cervejas/novo", method = RequestMethod.POST)
	public String cadastro(Cerveja cerveja){
		System.out.println(">>>>>> cadastrar!: " + cerveja.getSku());
		return "cerveja/CadastroCerveja";
	}
	
	

}
