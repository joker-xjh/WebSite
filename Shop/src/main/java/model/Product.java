package model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	private Integer pid;
	private String pname;
	private Float market_price;
	
	private CategorySecond categorySecond;
	
	@ManyToOne
	@JoinColumn(name = "categorysecondid",referencedColumnName = "csid")
	public CategorySecond getCategorySecond() {
		return categorySecond;
	}
	public void setCategorySecond(CategorySecond categorySecond) {
		this.categorySecond = categorySecond;
	}
	
	@Id
	@GeneratedValue
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Float getMarket_price() {
		return market_price;
	}
	public void setMarket_price(Float market_price) {
		this.market_price = market_price;
	}
	public Float getShop_price() {
		return shop_price;
	}
	public void setShop_price(Float shop_price) {
		this.shop_price = shop_price;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public Integer getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(Integer is_hot) {
		this.is_hot = is_hot;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	private Float shop_price;
	private Integer inventory;
	private String image;
	private String pdesc;
	private Integer is_hot;
	private Date pDate;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", market_price=" + market_price + ", shop_price="
				+ shop_price + ", inventory=" + inventory + ", image=" + image + ", pdesc=" + pdesc + ", is_hot="
				+ is_hot + ", pDate=" + pDate + "]";
	} 

}
