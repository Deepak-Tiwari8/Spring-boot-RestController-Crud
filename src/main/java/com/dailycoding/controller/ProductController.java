package com.dailycoding.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoding.entity.Product;
import com.dailycoding.service.ProductService;

@RestController
@RequestMapping("/products/")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@GetMapping("/")
	public List<Product> findAllProduct()
	{
		return productService.getAllProduct();	
	}
	
	@GetMapping("/{productId}")
	public Optional<Product> findProductById(@PathVariable("productId") Long productId)
	{
		return productService.getProductById(productId);
	}
	
	@PutMapping("/")
	public Product updateProductById(@RequestBody Product product, @PathVariable("productId") long productId)
	{
		return productService.addProduct(product);
	}
	
	@DeleteMapping("/{productId}")
	public String deleteProductById(@PathVariable long productId){
		return productService.deleteProductById(productId);
	}
}
