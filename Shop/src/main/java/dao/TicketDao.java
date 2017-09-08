package dao;

import model.Ticket;

public interface TicketDao extends BaseDao<Ticket>{
	
	Ticket find(Integer ticketID);

}
