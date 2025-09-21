package homework1;

import java.util.ArrayList;
import java.util.List;

public class HospitalDAO {

	private List<HospitalDTO> animalList = new ArrayList<>();
	
	public void save(HospitalDTO dto) {
		animalList.add(dto);
	}
	
	
	public List<HospitalDTO> findAll() {
		return animalList;
	}
	
}
