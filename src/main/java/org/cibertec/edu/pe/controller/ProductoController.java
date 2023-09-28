package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	public IProductoService producService;
	
	// Método para Listar
	@GetMapping("/index")	
	public String Listado(Model m) {
		List<Producto> producto = producService.Listar();
		m.addAttribute("producto", producto);
		return "index";	// listado.html
	}
	
	

}
