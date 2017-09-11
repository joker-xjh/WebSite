package service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.TicketDao;
import model.Ticket;
import service.TicketService;

@Transactional
@Service("ticketService")
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	private TicketDao ticketDao;

	@Transactional(readOnly = true)
	public Ticket findByCategoryID(Integer categoryID) {
		return ticketDao.find(categoryID);
	}

}
