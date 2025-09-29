package homework0926;

import java.util.List;

public class DeliveryService {

	private DeliveryDAO dao;
	int nextId;
	
	public DeliveryService(DeliveryDAO dao) {
		this.dao = dao;
		this.nextId = getId() + 1;
	}
	
	
	private int getId() {
		int max = 0;
		for(DeliveryDTO dto : dao.findAll()) {
			if(dto.getId()>max) {
				max = dto.getId();
			}
		}
		return max;
	}
	
	
	public void addDelivery(String name, int price, int order, int total) {
		DeliveryDTO dto = new DeliveryDTO(nextId, name, price, order, total);
		dao.save(dto);
	}
	
	public List<DeliveryDTO> getDelivery() {
		return dao.findAll();
	}

	public DeliveryDTO getById(int id) {
		return dao.findById(id);
	}

	public boolean deleteDelivery(int id) {
		return dao.deleteByDelivery(id);
	}

	public int getSumTotal() {
		int sum = 0;
		for(DeliveryDTO dto : getDelivery()) {
			sum+= dto.getTotal();
		}
		return sum;
	}
	public boolean editDelivery(int id, String newName, int newPrice, int newOrder, int newTotal) {
		return dao.renewDelivery(id, newName, newPrice, newOrder, newTotal);
	}
	
	
}
