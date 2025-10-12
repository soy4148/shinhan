package travel;

import java.util.List;

public class TravelService {

	private TravelDAO dao = new TravelDAO();

	public List<TravelDTO> getBySeason(String season) {
		return dao.findBySeason(season);
	}
	
}
