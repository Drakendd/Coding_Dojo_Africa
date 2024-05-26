package com.dhia.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dhia.savetravels.models.Expense;
import com.dhia.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepo;
	
	//Read All
	public List<Expense> getAll(){
		return expenseRepo.findAll();	
		}
	
	//Create
	public Expense create(Expense e) {
		return expenseRepo.save(e);
	}
	
	//Read One 
	public Expense getById(Long id) {
		Optional<Expense> selectedB = expenseRepo.findById(id);
		if (selectedB.isEmpty()) {
			return null;
		}else {
			return selectedB.get();
		}
	}
	
	//Update
	public Expense updateExpense(Expense e) {
		return expenseRepo.save(e);
	}
	
	//Delete
	public void delete(Long id) {
		expenseRepo.deleteById(id);
	}
	
	
}

