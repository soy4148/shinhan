package homework1;

import java.util.List;

public class HospitalService {

	
	private HospitalDAO dao;
	
	public HospitalService(HospitalDAO dao) {
		this.dao = dao;
	}
	
	
	public void addHospital(String id, String pname, String aname, int age, int pnum) {
		HospitalDTO dto = new HospitalDTO(id, pname, aname, age, pnum);
		dao.save(dto);
	}

	public List<HospitalDTO> getAllHos() {
		return dao.findAll();
	}

}
