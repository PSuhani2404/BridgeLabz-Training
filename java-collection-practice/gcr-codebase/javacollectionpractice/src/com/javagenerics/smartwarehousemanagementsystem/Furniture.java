package com.javagenerics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem
{
	private String name;
	private int quantity;
	
	Furniture(String name,int quantity)
	{
		super(name,quantity);
	}
	@Override
	public String getCategory()
	{
		return "Furniture";
	}

}
