package Week3;

public interface VehicleInterface {
	
	//methods or variables with syntax or design 
	public class Vehicle {
		
		
		public void applyBrake() {
			System.out.println("Applying brake.. Stop now !!");
		}

		public void soundHorn() {
			System.out.println("Hello there.. Get out of my way !!");
		}
		
		protected void getColor() {
			System.out.println("Color is not painted !");
		}
		
		boolean isPuncture() {
			return false;
		}
	}

}
