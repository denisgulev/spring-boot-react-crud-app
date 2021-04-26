package com.denis.sb.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denis.sb.react.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
