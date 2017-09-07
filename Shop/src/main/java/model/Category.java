package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	private Integer cid;
	private String cname;
	private Float discount;
	private Date privilegeTime;
	
	private Set<CategorySecond> categorySeconds = new HashSet<CategorySecond>();
	
	private Ticket ticket;

	@Id
	@GeneratedValue
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getPrivilegeTime() {
		return privilegeTime;
	}

	public void setPrivilegeTime(Date privilegeTime) {
		this.privilegeTime = privilegeTime;
	}

	@OneToMany(mappedBy="category",fetch = FetchType.LAZY)
	@OrderBy("csid")
	public Set<CategorySecond> getCategorySeconds() {
		return categorySeconds;
	}

	public void setCategorySeconds(Set<CategorySecond> categorySeconds) {
		this.categorySeconds = categorySeconds;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", discount=" + discount + ", privilegeTime="
				+ privilegeTime + "]";
	}

}
