package pe.edu.upeu.exa3backendsebastianllata.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.exa3backendsebastianllata.service.ProductoService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoservice;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return productoservice.readAll();
	}

}
