package com.day9.birdsanctuaryapp;

public class Eagle  extends Bird implements Flyable {

		public Eagle(int id, String name) {
			super(id, name, "Eagle");
		}

		@Override
		public void eat() {
			System.out.println(getName() + " is eating meat high in the sky.");
		}

		@Override
		public void fly() {
			System.out.println(getName() + " is soaring high above the mountains!");
		}
}
