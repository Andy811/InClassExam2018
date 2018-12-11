package com.exam;

import java.util.ArrayList;

public class Order {
	ArrayList t = new ArrayList();
	
	public void add(Ticket ticket) {
		t.add(ticket);

	}

	public void print() {
		System.out.print(new Ticket().result);
	}

}
