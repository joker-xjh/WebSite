package service;

import model.Packet;

public interface PacketService {
	
	Packet findByUserID(Integer userID);

}
