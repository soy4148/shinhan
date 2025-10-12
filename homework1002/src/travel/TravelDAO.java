package travel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TravelDAO {

	
	List<TravelDTO> travellist;
	public TravelDAO() {
		this.travellist = getInfo();
	}
	
	public List<TravelDTO> getInfo() {
		List<TravelDTO> list = new ArrayList<TravelDTO>();
		
		// select * from travel where rating >= 4.5
		String sql = "select * from travel where rating >= 4.5";	
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String location = rs.getString("location");
				double rating = rs.getDouble("rating");
				String season = rs.getString("season");
				
				TravelDTO dto = new TravelDTO(id, name, location, rating, season);
				list.add(dto);
			}
			
		} catch (Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
		
		return list;
	}

	public List<TravelDTO> findBySeason(String season) {
		List<TravelDTO> list = new ArrayList<TravelDTO>();
		for(TravelDTO dto : travellist) {
			if(dto.getSeason().equals(season)) {
				list.add(dto);
			}
		}
		return list;
	}
	
	
	
	

}