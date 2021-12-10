package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping("add")
	public Product addProduct(@RequestBody Product newProduct) {
		return ps.addProduct(newProduct);
	}
	
	@GetMapping("all")
	public List<Product> getAllProducts(){
		return this.ps.getAllProducts();
	}
	
	@DeleteMapping("delete/{id}")
	public boolean deleteProduct(@PathVariable("id") int id) {
		return this.ps.deleteProduct(id);
	}
	

}



