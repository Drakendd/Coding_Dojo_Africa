package com.yassin.burgertrucker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.yassin.burgertrucker.models.Burger;
import com.yassin.burgertrucker.services.BurgerService;

import jakarta.validation.Valid;


@Controller
public class BurgerController {
	
	@Autowired
	private BurgerService burgerServ;
	
	@GetMapping("/burgers")
	public String index(@ModelAttribute("burger") Burger burger,
						Model model) {
		List<Burger> burgers = burgerServ.getAll();
		model.addAttribute("allBurgers",burgers);
		return "index.jsp";
	}
	
	@PostMapping("/newBurger")
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger,BindingResult result,Model model) {
		if (result.hasErrors()) {
			List<Burger> burgers = burgerServ.getAll();
			model.addAttribute("allBurgers",burgers);
			return "index.jsp";
		}else {
			burgerServ.create(burger);
			return"redirect:/burgers";
		}
	}
	
	@GetMapping("/burgers/{id}")
	public String displayEdit(Model model, @PathVariable("id") Long id) {
		Burger burger = burgerServ.getById(id);
		model.addAttribute("burger",burger);
		return "update.jsp";
	}
	
	@PutMapping("/burgers/{id}")
	public String edit(@Valid @ModelAttribute("burger")Burger burger, BindingResult result) {
		if (result.hasErrors()) {
			return "update.jsp";
		}else {
			burgerServ.updateBurger(burger);
			
			return "redirect:/burgers";
		}
	}
}

