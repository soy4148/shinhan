package homework2;

import java.util.List;

public class MealService {
	private MealDAO dao;
	
	public  MealService(MealDAO dao) {
		this.dao = dao;
	}
	
	public void addMeal(int ingred, String name, int num, String date) {
		MealDTO dto = new MealDTO(ingred, name, num, date);
		dao.save(dto);
	}
	
	public List<MealDTO> getAllMeal() {
		return dao.findAll();
	}
}
