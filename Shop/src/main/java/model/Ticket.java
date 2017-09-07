package model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	
	private Integer tid;
	private Float privilege;
	private Float consume;
	private Date useDate;
	
	private Category category;

	
	@Id
	@GeneratedValue
	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Float getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Float privilege) {
		this.privilege = privilege;
	}

	public Float getConsume() {
		return consume;
	}

	public void setConsume(Float consume) {
		this.consume = consume;
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	
	@OneToOne
	@JoinColumn(name = "categoryid", referencedColumnName = "cid", unique = true)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", privilege=" + privilege + ", consume=" + consume + ", useDate=" + useDate
				+ "]";
	}
	
	

}
