package homework2;

public class MealMain {
	public static void main(String[] args) {
	
		
		MealDAO dao = new MealDAO();
		MealService service = new MealService(dao);
		MealController controller = new MealController(service);
		
		
		controller.run();
		
	}
}
