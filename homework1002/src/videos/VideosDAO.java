package videos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VideosDAO {

	public List<VideosDTO> selectAllVid() {
		List<VideosDTO> list = new ArrayList<VideosDTO>();
		String sql = "select * from videos";
		try (Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()
				) {
					while (rs.next()) {
						int id = rs.getInt("id");
						String title = rs.getString("title");
						String chname = rs.getString("chname");
						Date uploaddate = rs.getDate("uploaddate");
						int views = rs.getInt("views");
						int likes = rs.getInt("likes");
						
						VideosDTO dto = new VideosDTO(id, title, chname, uploaddate, views, likes);
						list.add(dto);
						
					}
			
			
		} catch (Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
		
		return list;
	}

}
