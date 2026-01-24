package com.javagenerics.smartwarehousemanagementsystem;

public abstract class WarehouseItem 
{
	private String name;
	private int quantity;
	
	WarehouseItem(String name,int quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName()
	{
		return name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public abstract String getCategory();
	
	@Override
	public String toString()
	{
		return getCategory()+ "[Name : "+name+", Quantity : "+quantity+"]";
	}
	
}
