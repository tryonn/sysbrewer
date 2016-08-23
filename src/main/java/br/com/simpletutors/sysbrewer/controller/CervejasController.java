package br.com.simpletutors.sysbrewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.simpletutors.sysbrewer.model.Cerveja;
 
@Controller
public class CervejasController {
	
	
	// se for um get chama esse
	@RequestMapping("/cervejas/novo")
	public String novo(){
		return "cerveja/CadastroCerveja";
	}
	
	
	// se for um post chama esse
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastro(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes redirectAttributes){
		
		if (result.hasErrors()){
			model.addAttribute("message", "Erro no formulario"); // manda mensagem para tela
			
			System.out.println("Tem error....");
			return "cerveja/CadastroCerveja"; // manda para propria pagina quando de erro
		}
		System.out.println(">>>>>> cadastrar!: " + cerveja.getSku());
		
		//model.addAttribute("message", "Registro salvo"); // essa maneira aqui não funciona pq estamos utilizando um redirect. E os dados se pedem
		//para o redirect utilizamos o 
		
		
		redirectAttributes.addFlashAttribute("message", "Registro salvo"); // vai fazer ele permanecer mesmo apos um redirection, ele cria uma sessão temporaria
		return "redirect:/cervejas/novo";
	}
	
	

}
