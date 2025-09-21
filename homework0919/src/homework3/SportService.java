package homework3;

import java.util.List;

public class SportService {
		private SportDAO dao;
		
		public SportService(SportDAO dao) {
			this.dao = dao;
		}
		
		public void addSport(String name, int num, int kcal, int ckcal) {
			SportDTO dto = new SportDTO(name, num, kcal, ckcal);
			dao.save(dto);
		}
		
		public List<SportDTO> getAllSport() {
			return dao.findAll();
		}
}
