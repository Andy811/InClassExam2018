package com.exam;

import java.util.ArrayList;

public class Ticket {
Order order = new Order();
String result;	
public Ticket(){
	
}
public Ticket(String origin,String destination,int price,int quantity){
	
		 result = origin+" "+destination+" "+price+" "+quantity;
		
	}

}
