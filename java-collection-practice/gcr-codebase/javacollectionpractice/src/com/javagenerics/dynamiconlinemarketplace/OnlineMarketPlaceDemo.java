package com.javagenerics.dynamiconlinemarketplace;

public class OnlineMarketPlaceDemo 
{
	public static void main(String[] args) 
	{

	        Product<BookCategory> book =new Product<>("Java Programming", 500.0, new BookCategory());

	        Product<ClothingCategory> shirt = new Product<>("T-shirt", 800.0, new ClothingCategory());

	        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000.0, new GadgetCategory());

	        ProductCatalog catalog = new ProductCatalog();

	        catalog.addProduct(book);
	        catalog.addProduct(shirt);
	        catalog.addProduct(phone);

	        DiscountService.applyDiscount(book, 10);
	        DiscountService.applyDiscount(phone, 5);

	        System.out.println("=== Product Catalog ===");
	        catalog.displayProducts();
	    }
}
