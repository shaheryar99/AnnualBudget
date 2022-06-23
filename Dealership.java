package cardealership;

public class Dealership {

	private int numCars;
	private String name;
	
	// Getters
	
	public int getNumCars() {
		return numCars;
	}
	
	public String getName() {
		return name;
	}
	
	// Setters
	public void setNumCars(int newnumCars) {
		this.numCars = newnumCars;
	}
	
	public void setname(String newname) {
		this.name = newname;
	}
	
	// Default Constructor
	public Dealership() {
		
	}
	
	// Paramatized
	public Dealership(int numofCars, String dealershipName) {
		this.name = dealershipName;
		this.numCars = numofCars;
	}
	
	// Method that calculates annual budget
	
	public String getAnnualBudget() {
		int budget = 0;
		for(int i = 0; i < numCars; i++ ) {
			budget += 2937.00;
		}
		return ("The budget for: "+ name + " is: $" + budget + " based on " + numCars + " cars.");
	}
	
}
