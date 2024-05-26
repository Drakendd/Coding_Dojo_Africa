package com.dhia.savetravels.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dhia.savetravels.models.Expense;
import com.dhia.savetravels.services.ExpenseService;

import jakarta.validation.Valid;


@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseServ;
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense,
						Model model) {
		List<Expense> expenses = expenseServ.getAll();
		model.addAttribute("expenses",expenses);
		return "index.jsp";
	}
	
	@PostMapping("/newExpense")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense,BindingResult result,Model model) {
		if (result.hasErrors()) {
			List<Expense> expenses = expenseServ.getAll();
			model.addAttribute("expenses",expenses);
			return "index.jsp";
		}else {
			expenseServ.create(expense);
			return"redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String displayEdit(Model model, @PathVariable("id") Long id) {
		Expense expense = expenseServ.getById(id);
		model.addAttribute("expense",expense);
		return "update.jsp";
	}
	
	@PutMapping("/expenses/{id}")
	public String edit(@Valid @ModelAttribute("expense")Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "update.jsp";
		}else {
			expenseServ.updateExpense(expense);
			
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String showOne(Model model, @PathVariable("id")Long id) {
		Expense selectedExpense = expenseServ.getById(id);
		model.addAttribute("expense",selectedExpense);
		return"showOne.jsp";
		 
	}
	
	@DeleteMapping("/expenses/{id}")
	public String deleteOne(@PathVariable("id")Long id) {
		expenseServ.delete(id);
		return "redirect:/expenses";
	}
}

