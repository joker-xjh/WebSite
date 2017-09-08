package model;

public class CartItem {
	
	private Product product;
	private Integer count;
	private Float price;
	
	@SuppressWarnings("unused")
	private Float subtotal;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getSubtotal() {
		return count * price;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	
	

}
