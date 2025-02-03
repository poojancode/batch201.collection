package com.advance.collection;

import java.util.List;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ProductOperation operation=new ProductOperation();
		int choice=0;
		do {
			System.out.println("1.add product");
			System.out.println("2.get specific product");
			System.out.println("3.get all product");
			System.out.println("0.terminated ");
			System.out.println();
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
		switch(choice) {
		
		case 1:{
			Product product=ProductUtility.PreparedProduct();
			String msg=operation.addProduct(product);
			System.out.println(msg);
			break;
		}
		case 2:{
			
			System.out.println("Enter product name to search: ");
			String productName = sc.nextLine();
			
			Object perticularProduct = operation.getPerticularProduct(productName);
			System.out.println(perticularProduct);
			break;
		}
		case 3:{
			
			Object obj=operation.getAllProduct();
			
			if(obj instanceof String) {
				System.out.println(obj);
			}else {
				List<Product>list=(List<Product>)obj;
				for(Product product:list) {
					System.out.println(product);
				}
			}
			break;	
		}
		case 4:{
			
			
		}
		default:System.out.println("default ......");
			choice=0;
		}
		
		}while(choice!=0);
		System.out.println("Application terminated");
	}

	
}
