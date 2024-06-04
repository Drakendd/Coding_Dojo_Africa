package com.yassin.book.club.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.yassin.book.club.models.LoginUser;
import com.yassin.book.club.models.User;
import com.yassin.book.club.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo ;
	
	//register
	public User register ( User newUser , BindingResult result) {
		Optional<User>opUser = userRepo.findByEmail(newUser.getEmail());
		if(opUser.isPresent()) {
			result.rejectValue("email", "registerErrors" , "Email is already Taken");
		}
		if (!newUser.getPassword().equals(newUser.getConfirmPassword())) {
			result.rejectValue("confirmPassword","registerErrors","password and confirmed password must match");
		}
		if (result.hasErrors()){
			return null;
		}else {
			newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
			return userRepo.save(newUser);
		}
	}
	public User login( LoginUser newLoginUser , BindingResult result ) {
		Optional<User> opUser = userRepo.findByEmail(newLoginUser.getEmail());
		if(!opUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "Invalid credential!");
		}else {
			User user = opUser.get();
			//check password 
			if(!BCrypt.checkpw(newLoginUser.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginErrors", "Invalid credential!");
			} 		
			if(result.hasErrors()) {
				return null;
			}else {
				return user ;
			}
			
		}
		return null;
	}
	public User findUserById (Long id) {
		Optional<User> maybeUser = userRepo.findById(id);
		if(maybeUser.isPresent()) {
			return maybeUser.get();
		}else {
			return null;
		}
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


