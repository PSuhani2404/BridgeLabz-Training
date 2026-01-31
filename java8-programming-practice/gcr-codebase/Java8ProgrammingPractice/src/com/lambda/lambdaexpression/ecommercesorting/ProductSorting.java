package com.lambda.lambdaexpression.ecommercesorting;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ProductSorting 
{
	public static void main(String[] args)
	{
		List<Product> products = new ArrayList<>();
		products.add(new Product("Handbag",2000,4.2));
		products.add(new Product("Earphone",500,3.7));
		products.add(new Product("Phone",20000,4.5));
		products.sort((p1,p2) -> Double.compare(p1.price,p2.price));
		System.out.println("Sorted by price :" +products );
		products.sort((p1,p2) -> Double.compare(p2.rating,p1.rating));
		System.out.println("Sorted by rating :" +products );
		products.sort((p1,p2) -> p1.name.compareTo(p2.name));
		System.out.println("Sorted by name :" +products );
	}

}
