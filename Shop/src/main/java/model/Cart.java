package model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	
	private Map<Integer, CartItem> map = new LinkedHashMap<Integer, CartItem>();
	private Float totla;
	
	public Collection<CartItem> getCarItems(){
		return map.values();
	}
	
	
	public void addCart(CartItem cartItem) {
			Integer productid = cartItem.getProduct().getPid();
			if(map.containsKey(productid)) {
				CartItem temp = map.get(productid);
				temp.setCount(temp.getCount() + cartItem.getCount());
			}
			else {
				map.put(productid, cartItem);
			}
			totla += cartItem.getSubtotal();
	}
	
	public void removeCart(Integer productid) {
		CartItem cartItem = map.remove(productid);
		totla -= cartItem.getSubtotal();
	}
	
	public void clearCart() {
		map.clear();
		totla = 0f;
	}
	
	
	
	public Float getTotla() {
		return totla;
	}
	
	public void setTotla(Float totla) {
		this.totla = totla;
	}
	
	

}
