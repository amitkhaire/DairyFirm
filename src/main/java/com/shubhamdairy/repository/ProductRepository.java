package com.shubhamdairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubhamdairy.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
