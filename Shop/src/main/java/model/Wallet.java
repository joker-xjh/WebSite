package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "wallet")
@Entity
public class Wallet {
	
	private Integer wid;
	private Float money;
	private User user;
	
	@Id
	@GeneratedValue
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	
	@OneToOne
	@JoinColumn(name = "uid",referencedColumnName="uid",unique = true)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Wallet [wid=" + wid + ", money=" + money + "]";
	}
	
	

}
