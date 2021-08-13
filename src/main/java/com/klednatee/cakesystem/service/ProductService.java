package com.klednatee.cakesystem.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klednatee.cakesystem.entity.Product;
import com.klednatee.cakesystem.repository.ProductRepository;

@Service
public class ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> listAll(String keyword){
		
		if(keyword!=null) {
			return productRepository.search(keyword);
		}
		return productRepository.findAll();
}
	// อ่านข้อมูลทั้งหมด
	
	public Product get(int id) {
		return productRepository.findById(id).get();
	}
	
	
	public void save(Product product) {
		productRepository.save(product);
	}
	
	
	public void delete(int id) {
		productRepository.deleteById(id);
	}
}
