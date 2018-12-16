package com.exam;

import java.util.ArrayList;

import org.junit.Test;

public class Order {
	ArrayList t = new ArrayList();

	@Test
	public void add(Ticket ticket) {
		t.add(ticket.origin);
		t.add(ticket.destination);
		t.add(ticket.price);
		t.add(ticket.quantity);
		t.add(ticket.price*ticket.quantity);
		
	}

	@Test
	public void print() {
		System.out.print(t);
	}

}
