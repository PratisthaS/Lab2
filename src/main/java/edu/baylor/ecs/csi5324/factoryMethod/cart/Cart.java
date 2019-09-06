package edu.baylor.ecs.csi5324.factoryMethod.cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import edu.baylor.ecs.csi5324.factoryMethod.product.Product;

public class Cart {

	private List<CartLineItem> orderList = new ArrayList<CartLineItem>();

	public Cart addLine(Product product, int amount) {
		// aggregation
		for(CartLineItem line : orderList) {
			if (line.getProduct() == product) { // left == on purpose!
				line.setQuantity(line.getQuantity()+amount);
				return this;
			}
		}
		
		orderList.add(CartLineItem.make(product, amount));
		return this;
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (CartLineItem orderLine : orderList) {
			total = total.add(orderLine.getSubTotal());
		}
		return total;
	}

	public List<CartLineItem> getOrderList() {
		return orderList;
	}
}
