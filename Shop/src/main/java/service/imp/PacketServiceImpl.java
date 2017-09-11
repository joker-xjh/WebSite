package service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PacketDao;
import model.Packet;
import service.PacketService;

@Transactional
@Service("packetService")
public class PacketServiceImpl implements PacketService{

	@Autowired
	private PacketDao packetDao;
	
	@Transactional(readOnly = true)
	public Packet findByUserID(Integer userID) {
		return packetDao.findByUserID(userID);
	}

}
