package homework0926;

import java.text.DecimalFormat;

public class DeliveryDTO {

	
	/*
	 * 상품명(자동증가번호), 품명, 가격, 주문가능수(재고), 현재재고(주문 후 남은 수량)
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	private int id;
	private String name;
	private int price;
	private int order;
	private int total;
	
	public DeliveryDTO() {}

	public DeliveryDTO(int id, String name, int price, int order, int total) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.order = order;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	DecimalFormat df = new DecimalFormat("#,###");
	
	@Override
	public String toString() {
		return String.format("주문번호: %d | 주문명: %s | 가격: %s원 | 주문가능수: %d | 남은 수량: %d", id, name, df.format(price), order, total);
	}
}
