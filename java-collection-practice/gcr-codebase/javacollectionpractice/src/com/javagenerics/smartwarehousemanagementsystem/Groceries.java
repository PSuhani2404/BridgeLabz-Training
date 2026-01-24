package com.javagenerics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem
{
	private String name;
	private int quantity;
	Groceries(String name,int quantity)
	{
		super(name,quantity);
	}
	@Override
	public String getCategory()
	{
		return "Groceries";
	}

}
