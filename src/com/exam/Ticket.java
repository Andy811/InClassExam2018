package com.exam;

import java.util.ArrayList;

public class Ticket {
	Order order = new Order();
	String origin;
	String destination;
	int price;
	int quantity;

	public Ticket() {

	}

	public Ticket(String origin, String destination, int price, int quantity) {

		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;

	}

}
