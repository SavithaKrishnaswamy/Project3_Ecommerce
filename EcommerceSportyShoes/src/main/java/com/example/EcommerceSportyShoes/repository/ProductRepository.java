package com.example.EcommerceSportyShoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceSportyShoes.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

	List<Products> findList(String productcategory);

}
