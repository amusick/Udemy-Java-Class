package com.sqa.am.udemy;
public class getterSetter {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 25;
		// person1.speak();
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years to retirements: " + years);
		int age = person1.getAge();
		System.out.println("Your current age is: " + age);
		System.out.println("Your name is: ");
	}
}

class Person {

	String name;

	int age;

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - this.age;
		return yearsLeft;
	}

	int getAge() {
		return this.age;
	}
}
