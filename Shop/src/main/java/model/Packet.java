package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "packet")
public class Packet {
	
	private Integer pid;
	private User user;
	
	@Id
	@GeneratedValue
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	@OneToOne(optional = false)
	@JoinColumn(name = "uid", referencedColumnName = "uid",unique = true)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Packet [pid=" + pid + "]";
	}
	

}
