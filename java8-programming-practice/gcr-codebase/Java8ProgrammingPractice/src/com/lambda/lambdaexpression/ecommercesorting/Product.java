package com.lambda.lambdaexpression.ecommercesorting;

public class Product
{
	String name;
	double price;
	double rating;
	
	Product(String name,double price,double rating)
	{
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public String toString()
	{
		return name + "[Price: "+price+",Rating: " +rating+ "]";
	}

}
