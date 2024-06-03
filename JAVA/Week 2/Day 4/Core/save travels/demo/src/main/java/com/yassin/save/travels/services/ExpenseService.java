package com.yassin.save.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassin.save.travels.models.Expense;
import com.yassin.save.travels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepo;
	
	//read all
	public List<Expense>getAll(){
		return expenseRepo.findAll();	
	}
	//create
	public Expense create(Expense ex) {
		return expenseRepo.save(ex);
	}
	//read one
	public Expense getById(Long id) {
		Optional<Expense> selectedB = expenseRepo.findById(id);
		if (selectedB.isEmpty()) {
			return null;
		}
		else {
			return selectedB.get();
		}
		
		
	}
	//update
	public Expense updateExpense(Expense ex) {
		return expenseRepo.save(ex);
	}
	//Delete
		public void delete(Long id) {
			expenseRepo.deleteById(id);
		}

}
