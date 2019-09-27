package sv.com.empresa.springproject.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sv.com.empresa.springproject.entidades.Usuarios;

@Controller
@RequestMapping("/usuarios")
public class ControladorUsuarios {
	
	@GetMapping("/listar")
	public ModelAndView inicio () {
		ModelAndView mav = new ModelAndView("/usuarios.jsp");
		
		Usuarios u = new Usuarios();
		u.setUsuario("abilio");
		u.setNombres("Manuel Abilio");
		u.setClave("12345");
		
		mav.addObject("persona", u);
		
		return mav;
	}
	
	@GetMapping("/otra")
	public String otra () {
		return "redirect: listar";
	}
}