package cardealership;

public class Car extends Dealership {

	private int sedans;
	private int coupes;
	
	// Paramatized constructor
	public Car (int numOfCars, String dealerName, int numSedans, int numCoupes) {
		super(numOfCars, dealerName);
		this.sedans = numSedans;
		this.coupes = numCoupes;
		
	}
	
	//Default Constructor
	public Car() {
		super();
	}
	
	//Getter
	public int getCoupes() {
		return coupes;
	}
	
	//Setter
	public void setCoupes(int coupes) {
		this.coupes = coupes;
	}

	//Getter
	public int getSedans() {
		return sedans;
	}

	//Setter
	public void setSedans(int sedans) {
		this.sedans = sedans;
	}
	
	// Method 1, overriding 
	
	public String getAnnualBudget() {
		int budget = 0;
		int coupebudget = 0;
		int sedanbudget = 0;
		
		System.out.println("In the real market, coupes are cheaper than sedans, therefore adjustments must be made.");
		
		for (int i = 0; i < sedans; i++) {
			sedanbudget += 2937;
		}
		
		for (int j = 0; j < coupes; j++) {
			coupebudget += 2457;
		}
		
		budget = sedanbudget + coupebudget;
		
		return ("The adjusted budget comes to: $" + budget + " with " + getNumCars() + " cars");
		
	}
	
	// Method 2
	
	public String getTotalDoors() {
		
		int door1 = 0;
		int door2 = 0;
		
		for (int i = 0; i < sedans; i++) {
			door1 += 4;
	}
	
		for (int j = 0; j < coupes; j++) {
			door2 += 2;
		}
		
		int totaldoors = 0;
		totaldoors = door1 + door2;
		
		return ("The total number of doors is: " + totaldoors);
	}
	
	public static void main(String[] args) {
		
		// Initialize Parent Class
		
		Dealership Honda = new Dealership(20, "Honda Dealership");
		
		// Initialize Child Class
		Car newcar = new Car(20, "Honda Dealership", 12, 8);

		// Object of parent class with reference to Child Class
		Dealership Infiniti = new Car(20, "Infiniti Dealership", 12, 8);
		
		// Show coupes and sedan numbers:
		
		System.out.println("Total number of cars: " + Infiniti.getNumCars() + " Coupes: " + newcar.getCoupes() + " Sedans: " + newcar.getSedans());
		
		// Method Overriding
		
		System.out.println("\nMethod Overriding. All instance variables are the same.");
		System.out.println("We will use the Annual Budget method, from the parent and child class.\n");
		
		System.out.println("Annual Budget using Parent Class:");
		System.out.println(Honda.getAnnualBudget());
		
		System.out.println("\nUsing Object of parent class with ref. to child class to show Annual Budget and name:");
		System.out.println("Name: " + Infiniti.getName() + " " + Infiniti.getAnnualBudget());
		
		System.out.println("\nAnnual Budget using Child Class:");
		System.out.println(newcar.getAnnualBudget());
		
		// Showing inheritance
		System.out.println("\nShowing inheritance, use Child class to get dealership name from parent method.");
		System.out.println(newcar.getName());
		System.out.println(Infiniti.getName());
		
		// Showing Methods
		System.out.println("\nShow child class method Get Total Doors:");
		System.out.println(newcar.getTotalDoors());
	}

}
