package com.javagenerics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem
{
	private String name;
	private int quantity;
	
	Electronics(String name,int quantity)
	{
		super(name,quantity);
	}
	@Override
	public String getCategory()
	{
		return "Electronics";
	}
	
}
