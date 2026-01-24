package com.javagenerics.mealplangenerator;
import java.util.List;

public class MealPlanGeneratorApp 
{
	/*
	4. Personalized Meal Plan Generator
	Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
	Problem Statement:
		Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
	Hints:
		Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
		Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
		Use a generic method to validate and generate a personalized meal plan dynamically.

	*/
		public static void main(String[] args)
		{
			System.out.println("Personalized Meal Plan Generator\n");

			List<String> proposedMeals = List.of("Grilled Chicken Salad", "Vegan Buddha Bowl", "Keto Avocado Eggs",
					"Pasta with Tomato Sauce", "Cheese Omelette", "Protein Shake with Whey", "Lentil Soup", "Beef Steak");

			// Generate different plans using generic method
			PersonalizedMeal<VegeterianMeal> vegetarianPlan = MealPlanGenerator.generatePlan(new VegeterianMeal(),
					proposedMeals);
			vegetarianPlan.displayPlan();

			PersonalizedMeal<VeganMeal> veganPlan = MealPlanGenerator.generatePlan(new VeganMeal(), proposedMeals);
			veganPlan.displayPlan();

			PersonalizedMeal<KetoMeal> ketoPlan = MealPlanGenerator.generatePlan(new KetoMeal(), proposedMeals);
			ketoPlan.displayPlan();

			PersonalizedMeal<HighProteinMeal> proteinPlan = MealPlanGenerator.generatePlan(new HighProteinMeal(),
					proposedMeals);
			proteinPlan.displayPlan();
		}
}
