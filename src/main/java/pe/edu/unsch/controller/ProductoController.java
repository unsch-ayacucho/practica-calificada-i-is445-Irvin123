package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
	
	@GetMapping("/producto")
	public String producto() {
		return "producto"; 
	}

}
