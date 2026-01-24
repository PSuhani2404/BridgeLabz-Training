package com.javagenerics.smartwarehousemanagementsystem;
import java.util.*;
public class WareHouseDemo 
{
	public static void displayItems(List<? extends WarehouseItem> items) 
	{
			for(WarehouseItem item :items)
			{
				System.out.println(item);
			}
	}
	public static void main(String[] args) 
	{

	        Storage<Electronics> electronicsStorage = new Storage<>();
	        electronicsStorage.addItem(new Electronics("Laptop", 10));
	        electronicsStorage.addItem(new Electronics("Smartphone", 25));

	        Storage<Groceries> groceryStorage = new Storage<>();
	        groceryStorage.addItem(new Groceries("Rice", 50));
	        groceryStorage.addItem(new Groceries("Milk", 30));

	        Storage<Furniture> furnitureStorage = new Storage<>();
	        furnitureStorage.addItem(new Furniture("Chair", 15));

	        System.out.println("=== Electronics ===");
	        displayItems(electronicsStorage.getItems());

	        System.out.println("\n=== Groceries ===");
	        displayItems(groceryStorage.getItems());

	        System.out.println("\n=== Furniture ===");
	        displayItems(furnitureStorage.getItems());
	 }
}


