package com.advance.collection;

import java.util.List;
import java.util.Scanner;


public class TestProduct {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		ProductOperation operation=new ProductOperation();
		int choice=0;
		do {
			System.out.println("1.add product");
			System.out.println("2.get specific product");
			System.out.println("3.get all product");
			System.out.println("0.terminated ");
			System.out.println( );

			System.out.println("Enter your choice");
			choice=scanner.nextInt();

			//			Product p1 = new Product(101, "pen", 24, 100.0, "2022-09-09", "2023-08-08");
			//			System.out.println(operation.addProduct(p1));


			switch(choice) {

			case 1:{
				Product product=ProductUtility.PreparedProduct();
				String msg=operation.addProduct(product);
				System.out.println(msg);
				break;
			}
			case 2:{

				System.out.println("Enter your productname");		
				String productName=scanner.next();
				Object obj=operation.getSpecificProduct(productName);
				System.out.println(obj);
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

			default:System.out.println("default ......");
			
			}

		}while(choice!=0);
		System.out.println("Application terminated");
	}


}
