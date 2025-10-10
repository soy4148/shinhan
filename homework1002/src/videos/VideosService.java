package videos;

import java.util.List;

public class VideosService {

	
	private VideosDAO dao = new VideosDAO();

	public List<VideosDTO> getAllVid() {
		return dao.selectAllVid();
	}

}
