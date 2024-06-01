package com.yassin.burgertrucker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassin.burgertrucker.models.Burger;
import com.yassin.burgertrucker.repositories.BurgerRepository;

@Service
public class BurgerService {
	@Autowired
	private BurgerRepository burgerRepo;
	 //read
	public List<Burger> getAll(){
		return burgerRepo.findAll();
		}
	public Burger create(Burger bt) {
		return burgerRepo.save(bt);
	}
	//read1
	public Burger getById(Long id){
		Optional<Burger>selecteddB = burgerRepo.findById(id);
		if (selecteddB.isEmpty()) {
			return null;
			}else {
				return selecteddB.get();
			}
		}
	//update
	public Burger updateBurger(Burger bt) {
		return burgerRepo.save(bt);
	}
}
