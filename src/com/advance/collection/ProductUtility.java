package com.advance.collection;
import java.util.Scanner;
public class ProductUtility {

	static Scanner sc = new Scanner(System.in);

	public static Product PreparedProduct() {
		System.out.println("Enter the ProductId");
		int ProductId = sc.nextInt();


		System.out.println("Enter the ProductName");
		String ProductName = sc.next();

		System.out.println("Enter ProductQty");
		int ProductQty=sc.nextInt();

		System.out.println("Enter ProductPrice");
		int ProductPrice=sc.nextInt();

		System.out.println("Enter the mfgdate");
		String mfgDate =sc.next();

		System.out.println("Enter the expdate");
		String expDate=sc.next();

		Product product=new Product(ProductId, ProductName, ProductQty, ProductPrice, mfgDate, expDate)	;	
		return product;

	}
}
