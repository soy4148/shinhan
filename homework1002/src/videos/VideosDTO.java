package videos;

import java.sql.Date;

public class VideosDTO {
// 번호, 영상 제목, 채널명, 업로드 날짜(yyyy-mm-dd), 조회수, 좋아요
// 모든 영상목록 조회해서 한줄씩 출력
// sql developer에서 커밋 잊지않기
	
	private int id;
	private String title;
	private String chname;
	private Date uploaddate;
	private int views;
	private int likes;
	
	public VideosDTO() {}

	// 읽어올때
	public VideosDTO(int id, String title, String chname, Date uploaddate, int views, int likes) {
		this.id = id;
		this.title = title;
		this.chname = chname;
		this.uploaddate = uploaddate;
		this.views = views;
		this.likes = likes;
	}

	// 입력할때
	public VideosDTO(String title, String chname, Date uploaddate, int views, int likes) {
		this.title = title;
		this.chname = chname;
		this.uploaddate = uploaddate;
		this.views = views;
		this.likes = likes;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getChname() {
		return chname;
	}

	public void setChname(String chname) {
		this.chname = chname;
	}

	public Date getUploaddate() {
		return uploaddate;
	}

	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	public String formatNum(int number) {
		return String.format("%,d", number);
	}
	
	@Override
	public String toString() {
		return String.format("번호: %d, 제목: %s, 채널명: %s, 업로드 날짜: %s, 조회수: %s, 좋아요: %s", id, title, chname, uploaddate, formatNum(views), formatNum(likes));
	}
	
	
	
	
	
}
