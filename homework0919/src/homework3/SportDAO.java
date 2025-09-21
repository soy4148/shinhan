package homework3;

import java.util.ArrayList;
import java.util.List;

public class SportDAO {
		List<SportDTO> memberList = new ArrayList<>();
		
		public void save(SportDTO dto) {
			memberList.add(dto);
		}
		
		public List<SportDTO> findAll() {
			return memberList;
		}
}
