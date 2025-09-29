package homework0926;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO {

	private List<DeliveryDTO> deliveryList;
	private String filename;
	
	public DeliveryDAO(String filename) {
		this.deliveryList = loadCsv(filename);
		this.filename = filename;
	}
	
	
	private List<DeliveryDTO> loadCsv(String filename) {
		List<DeliveryDTO> list = new ArrayList<DeliveryDTO>();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			String line;
			boolean isSkip = true;
			
			while((line = br.readLine()) != null) {
				if(isSkip) {
					isSkip = false;
					continue;
				}
				
				String[] parts = line.split(",");
				
				int id = Integer.parseInt(parts[0].trim());
				
				String name = parts[1].trim();
				int price = Integer.parseInt(parts[2].trim());
				int order = Integer.parseInt(parts[3].trim());
				int total = Integer.parseInt(parts[4].trim());
				
				list.add(new DeliveryDTO(id, name, price, order, total));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage()+"그 외 모든 오류");
		}
		return list;
	}
	
	public List<DeliveryDTO> findAll() {
		return deliveryList;
	}
	
	public void save(DeliveryDTO dto) {
		deliveryList.add(dto);
		writeCsv();
	}


	private void writeCsv() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filename));
			pw.println("id,name,price,order,total");
			for(DeliveryDTO dto : deliveryList) {
				pw.printf("%d, %s, %d, %d, %d", dto.getId(), dto.getName(), dto.getPrice(), dto.getOrder(), dto.getTotal());
			}
		} catch (IOException e) {
			System.out.println("저장 실패: " + e.getMessage());
		}
	}
	
	
	
	public DeliveryDTO findById(int id) {
		for(DeliveryDTO dto : deliveryList) {
			if(dto.getId() == id) {
				return dto;
			}
		}
		return null;
	}


	public boolean deleteByDelivery(int id) {
		for(int i = 0; i<deliveryList.size(); i++) {
			if(deliveryList.get(i).getId() == id) {
				deliveryList.remove(i);
				return true;
			}
		}
		return false;
	}


	public int count() {
		return deliveryList.size();
	}


	public boolean renewDelivery(int id, String newName, int newPrice, int newOrder, int newTotal) {
		DeliveryDTO dto = findById(id);
		if(dto != null) {
			dto.setName(newName);
			dto.setPrice(newPrice);
			dto.setOrder(newOrder);
			dto.setTotal(newTotal);
			return true;
		}
		return false;
	}
	
}
