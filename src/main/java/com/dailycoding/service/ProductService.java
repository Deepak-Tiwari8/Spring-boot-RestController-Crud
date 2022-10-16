package com.dailycoding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycoding.Respository.ProductRepository;
import com.dailycoding.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(Long productId) {
		return productRepository.findById(productId);
	}

	public Product updateProductById(Product product, long productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent()) {
			return productRepository.save(product);
		} else {
			return null;
		}
	}

	public String deleteProductById(long productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent()) {
			productRepository.delete(optional.get());
			return "Deleted";
		} else {
			return "No Product to delete";
		}
	}

	
}
