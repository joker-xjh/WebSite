package dao;

import model.Packet;

public interface PacketDao extends BaseDao<Packet>{
	
	Packet findByUserID(Integer userID);

}
