

package com.example.demo.Dao;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Pojo.Product;

import antlr.collections.List;

public interface ProductDao extends JpaRepository<Product, Integer>{
	@Override
	@Query("select p from Product p")
	java.util.List<Product> findAll();
}

