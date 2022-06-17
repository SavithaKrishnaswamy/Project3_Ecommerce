package com.example.EcommerceSportyShoes.websecurity.config.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.EcommerceSportyShoes.model.Users;
import com.example.EcommerceSportyShoes.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository usersRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws 
	     UsernameNotFoundException {
		
		
		Users users = usersRepo.getUsersByUsername(username);
		
		if(users == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return new MyUserDetails(users);
	}

}
