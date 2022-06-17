package com.example.EcommerceSportyShoes.websecurity.config.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.EcommerceSportyShoes.model.Roles;
import com.example.EcommerceSportyShoes.model.Users;

public class MyUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1233036274000647431L;

	private Users users;

	public MyUserDetails(Users users) {
		this.users = users;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		Set<Roles> roles = users.getRoles();

		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Roles role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));

		}
		return authorities;

	}

	@Override
	public String getPassword() {

		return users.getPassword();
	}

	@Override
	public String getUsername() {

		return users.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return users.isEnabled();
	}

}
