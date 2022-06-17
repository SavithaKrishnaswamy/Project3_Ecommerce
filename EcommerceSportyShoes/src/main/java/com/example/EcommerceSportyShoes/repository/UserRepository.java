package com.example.EcommerceSportyShoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.EcommerceSportyShoes.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	public Users getUsersByUsername(@Param("username") String username);

	List<Users> findByUsername(@Param("username") String username);
}
