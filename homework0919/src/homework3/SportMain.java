package homework3;


public class SportMain {
	public static void main(String[] args) {
		
		SportDAO dao = new SportDAO();
		SportService service = new SportService(dao);
		SportController controller = new SportController(service);
		
		controller.run();
	}
	
	
	
}
