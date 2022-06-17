package com.example.EcommerceSportyShoes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceSportyShoes.model.Users;
import com.example.EcommerceSportyShoes.repository.UserRepository;

@Service
@Transactional
public class UsersService {
	
	@Autowired
	private UserRepository usersRepo;
	
	public List<Users> listAll(String username) {
		if(username != null) {
			return usersRepo.findByUsername(username);
		}
		return usersRepo.findAll();
	}
	
	public void save(Users users) {
		usersRepo.save(users);
	}
	
	public Users get(int userId) {
		return usersRepo.findById(userId).get();
	}

}
