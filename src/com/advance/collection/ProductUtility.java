package com.advance.collection;
import java.util.Scanner;
public class ProductUtility {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Product PreparedProduct() {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		
		System.out.println("Enter price");
		int price=sc.nextInt();
		
		System.out.println("Enter the mfg date");
		String mfg =sc.next();
		
		System.out.println("Enter the expdate");
		String exp=sc.next();
		
		Product product=new Product(id,name,price,qty,mfg,exp);
		
		return product;
		
	}
}
