package homework2;

import java.util.ArrayList;
import java.util.List;

public class MealDAO {

	
	//저장할 것 만들기
	private List<MealDTO> mealList = new ArrayList<>();
	
	//저장하기
	public void save(MealDTO dto) {
		mealList.add(dto);
	}
	
	//출력하기
	public List<MealDTO> findAll() {
		return mealList;
	}
	
}
