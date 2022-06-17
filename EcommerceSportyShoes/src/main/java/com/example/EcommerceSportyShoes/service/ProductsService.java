package com.example.EcommerceSportyShoes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceSportyShoes.model.Products;
import com.example.EcommerceSportyShoes.repository.ProductRepository;

@Service
@Transactional
public class ProductsService {

	@Autowired
	private ProductRepository productsRepo;

	public List<Products> listAll(String category) {
		if (category != null) {
			return productsRepo.findList(category);
		}
		return productsRepo.findAll();
	}

	public void save(Products products) {
		productsRepo.save(products);
	}

	public Products get(int productId) {
		return productsRepo.findById(productId).get();
	}

	public void delete(int productId) {
		productsRepo.deleteById(productId);
	}

}
