package com.dailycoding.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycoding.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

	Product save(Product product);

}
