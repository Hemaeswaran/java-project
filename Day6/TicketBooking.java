package Day6;

public class TicketBooking {
	int tickets = 2;
	synchronized void bookTicket(String name, int wantedTickets) {
		if (wantedTickets <= tickets) {
			System.out.println(name + "booking" + wantedTickets + "ticket(s)...");
			try { Thread.sleep(2000);
		}catch (InterruptedException e) {}
			tickets -= wantedTickets;
			System.out.println("Booking successful Remaining:" + tickets);
	} else {
		System.out.println(name + "failed to book. not enough tickets.");
	}
	}
}
class BookingThread extends Thread {
	TicketBooking booking;
	String customer;
	
	BookingThread(TicketBooking booking, String customer, int seats) {
		this.booking = booking;
		this.customer = customer;
		
	}
	public void run() {
		}


	public static void main(String[] args) {
	  TicketBooking booking = new TicketBooking();
	  BookingThread t1 = new BookingThread(booking, "Shobana",2);
	  BookingThread t2 = new BookingThread(booking, "Hema",3);
	  BookingThread t3 = new BookingThread(booking, "Sandhiya",1);
	  t1.start();
	  t2.start();
	  t3.start();
	  
	}
}
