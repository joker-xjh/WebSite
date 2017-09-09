package service;

import model.Ticket;

public interface TicketService {
	
	Ticket findByCategoryID(Integer categoryID);
	

}
