package com.dhia.savetravels.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhia.savetravels.models.Expense;


@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>  {
		List<Expense> findAll();
}

