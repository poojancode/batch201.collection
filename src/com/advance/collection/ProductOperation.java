package com.advance.collection;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {

	List<Product>list=new ArrayList<Product>();
	public String addProduct(Product product) {
		
		for (Product p : list) {
			if(p.getProductName().equalsIgnoreCase(product.getProductName()));
			return "Product already exists";
		}
		
		list.add(product);
		return "Product added successfully";
	}
	
	public Object getAllProduct() {
		
		try {
			if(list.isEmpty()) {
				return "Product not exists ";
			}else {
				return list;
			}
		}catch(Exception e) {
			return"Something went wrong";
		}
		
	
	}

}
