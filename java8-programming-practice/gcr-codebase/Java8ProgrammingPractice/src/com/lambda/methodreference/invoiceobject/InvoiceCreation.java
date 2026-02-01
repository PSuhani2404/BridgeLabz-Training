package com.lambda.methodreference.invoiceobject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class InvoiceCreation 
{
	public static void main(String[] args)
	{
		List<String> rawIds = Arrays.asList("TXN101", "TXN102", "TXN103", "TXN104");
		List<Invoice> invoiceList = rawIds.stream().map(Invoice::new).collect(Collectors.toList());
		invoiceList.forEach(System.out::println);
	}

}
