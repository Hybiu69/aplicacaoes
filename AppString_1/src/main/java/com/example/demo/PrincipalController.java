package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/")
	public String index () {
		return "index";
	}

	@GetMapping("/sobre")
	public String sobre() {
		return "sobre.html";
	}
	@GetMapping("/compras")
	public String compras() {
		return "compras.html";
	}
	@GetMapping("/vendas")
	public String vendas() {
		return "vendas";
	}
	@GetMapping("/estoque")
	public String estoque() {
		return "estoque.html";
	}

}