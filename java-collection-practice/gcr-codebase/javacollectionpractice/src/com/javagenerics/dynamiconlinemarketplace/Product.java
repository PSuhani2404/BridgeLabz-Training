package com.javagenerics.dynamiconlinemarketplace;

public class Product<T extends Category>
{
	private String name;
	private double price;
	private T category;
	
	Product(String name,double price,T category)
	{
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public T getCategory()
	{
		return category;
	}
	public String toString()
	{
		return "Product [Name= "+name+", Category= "+category.getCategoryName()+", Price= "+price+"]";
	}

}
