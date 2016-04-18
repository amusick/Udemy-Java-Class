package com.sqa.am.udemy;

public class MachineApp {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Chalky", 7);
	}
}

class Machine {

	private String name;

	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor Running!");
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running!");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
}
