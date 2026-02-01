package com.lambda.methodreference.invoiceobject;

public class Invoice 
{
	String transactionId;
	
	Invoice(String transactionId)
	{
		this.transactionId = transactionId;
	}
	@Override
	public String toString()
	{
		return "Invoice Created for ID:" + transactionId;
	}

}
