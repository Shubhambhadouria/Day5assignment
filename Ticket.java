package com.masai;

public class Ticket {

	
	
	private int ticketid; 
	private int price; 
	public static int availableTickets;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}


	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		{
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets>0)
		{
			availableTickets = availableTickets - nooftickets;
			int total_amount = this.price * nooftickets;
			return total_amount;
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket t1 = new Ticket();
		
		t1.setPrice(100);
		t1.setTicketid(1230);
		t1.setAvailableTickets(50);
		
		System.out.println(t1.calculateTicketCost(5));
		
		t1.getPrice();
		t1.getTicketid();
		System.out.println(""t1.getAvailableTickets());
	}

}
