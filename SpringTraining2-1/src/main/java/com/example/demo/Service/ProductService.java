

package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Pojo.Product;
import com.example.demo.Dao.ProductDao;

@Service
public class ProductService{
	
	
	private ProductDao pd;

	
	
	@Autowired
	public ProductService(ProductDao pd) {
		super();
		this.pd = pd;
	}

	public Product addProduct(Product newProduct) {
		return this.pd.save(newProduct);
	}
	
	
	public boolean deleteProduct(int id) {
		try {
			this.pd.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public List<Product> getAllProducts() {
		return this.pd.findAll();
	}


}
