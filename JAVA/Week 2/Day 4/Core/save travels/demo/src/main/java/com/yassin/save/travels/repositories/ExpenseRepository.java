package com.yassin.save.travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yassin.save.travels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense,Long> {
	List<Expense> findAll();

}
