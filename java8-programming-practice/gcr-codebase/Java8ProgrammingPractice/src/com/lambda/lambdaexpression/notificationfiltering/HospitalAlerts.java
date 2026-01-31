package com.lambda.lambdaexpression.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class HospitalAlerts
{
	public static void main(String[] args)
	{
		List<Alert> alerts = new ArrayList<>();
		alerts.add(new Alert("Heart rate high","Critical"));
		alerts.add(new Alert("Battery low oon monitor","Warning"));
		alerts.add(new Alert("Lunch time for patients","Info"));
		alerts.add(new Alert("Oxygen level dropping","Critical"));
		Predicate<Alert> criticalFilter = (a) -> a.type.equals("Critical");
		System.out.println("Only show Critical Alerts");
		List<Alert> filteredAlerts = alerts.stream().filter(criticalFilter).collect(Collectors.toList());
		filteredAlerts.forEach(System.out::println);
	}
}
 