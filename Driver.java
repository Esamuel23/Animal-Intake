import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();
    //Above steps initializes array lists for dog and monkey classes

    public static void main(String[] args) {
    	
        initializeDogList();
        initializeMonkeyList();
        
        Scanner scnr = new Scanner(System.in);
        int input = 0; // stores numeric menu option
        boolean isValidSelection;
        
        do {
        	displayMenu(); //displays menu options
        	isValidSelection = true;
        	String userInput = scnr.nextLine(); //reads full line of input
        	
        	if (userInput.equalsIgnoreCase("q"))
        	{ //checks for quit command
        		System.out.println("Good Bye!");
        		System.exit(0);
        	}
        	try {
        		input = Integer.parseInt(userInput); //converts input string to integer
        		if (input < 1 || input > 6) {
        			throw new
        			NumberFormatException("Invalid Entry. Please try again.");
        		}
        		
        		} catch (NumberFormatException e) {
        			System.out.println(e.getMessage());
        			isValidSelection = false;
        	}
        } while (!isValidSelection);
        switch (input) {
        case 1 -> intakeNewDog(scnr);
        case 2 -> intakeNewMonkey(scnr);
        case 3 -> reserveAnimal(scnr);
        case 4 -> printDogs();
        case 5 -> printMonkey();
        case 6 -> printAnimals();
        }
        
        

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    private static Object printMonkey() {
		// TODO Auto-generated method stub
		return null;
	}

	// This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Johnny", "Macaque", "5.9", "8.9", "20.6", "male", "1", "16.3", true, "Canada");
    	Monkey monkey2 = new Monkey("Breck", "Capuchin", "5.1", "11.2", "21.7", "female", "1", "17.1", false, "Mexico");
    	Monkey monkey3 = new Monkey("Earl", "Tamarin", "5.7", "7.7", "19.3", "male", "3", "17.2", false, "United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    	
    }

    
    


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.print("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acqDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acqCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainStatus = scanner.nextLine();
        System.out.println("Is the dog reserved?");
        boolean dogRes = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("What is the dog's in service country?");
        String dogIsc = scanner.nextLine();
        Dog newdog = new Dog(name, breed, gender, age, weight, acqDate, acqCountry, trainStatus, dogRes, dogIsc);
        dogList.add(newdog);
    }
        	
    


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
       
        	public static void intakeNewMonkey(Scanner scanner) { 
        		System.out.println("What is the monkey's name?");
        	
        	String name = scanner.nextLine();
        	for (Monkey monkey : monkeyList) { 
        		if
        		(monkey.getName().equalsIgnoreCase(name)) 
        		{ 
        			System.out.println("\n\nThis monkey is already in our system\n\n"); 
        			return; // Returns to menu
        			} 
        		} System.out.println("What is the monkey's species?"); 
        		String species = scanner.nextLine();
        		if (!
        				(species.equalsIgnoreCase("Capuchin")) && 
        				!
        				(species.equalsIgnoreCase("Guenon")) && 
        				!
        				(species.equalsIgnoreCase("Macaque")) && 
        				!
        				(species.equalsIgnoreCase("Marmoset")) && 
        				!
        				(species.equalsIgnoreCase("Squirrel Monkey")) &&
        				!
        				(species.equalsIgnoreCase("Tamarin"))) { 
        			System.out.println("\n\nThis monkey's species is not allowed\n\n");
        			return; 
        			} // Continue to prompt for the rest of the information 
        		System.out.println("What is the monkey's tail length?"); 
        		String tailLength = scanner.nextLine();
        		// ... and so on for the other attributes // After collecting all attributes, create a new Monkey object 
        		// Assume that Monkey constructor takes all the necessary parameters 
        		Monkey newMonkey = new Monkey(name, species, tailLength, tailLength, tailLength, tailLength, tailLength, tailLength, false, tailLength); 
        		
        	
        	monkeyList.add(newMonkey); 
        	
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        	public static void reserveAnimal(Scanner scanner) { 
        		boolean isValidSelection = false; 
        		do { 
        			System.out.println("Enter animal type: Monkey or Dog"); 
        			String type = scanner.nextLine().trim().toLowerCase();
        			switch (type) {
        			case "monkey": 
        				isValidSelection = processReservation(scanner, monkeyList, "monkey"); 
        				break; 
        				case "dog": isValidSelection = processReservation(scanner, dogList, "dog"); 
        				break; 
        				default: System.out.println("Invalid entry. Please enter 'Monkey' or 'Dog'."); 
        				break; 
        				} 
        			} while (!isValidSelection);
        		} 
        	
        	private static <T extends RescueAnimal>
        	boolean processReservation(Scanner scanner, List<T> animalList, String animalType) { 
        		System.out.println("Name - Training Status - Acquisition Country - Reservation Status"); 
        		for (T animal : animalList) { 
        			if (!animal.getReserved()) 
        				System.out.println(animal); }
        		System.out.println("Enter name: "); 
        		String name = scanner.nextLine().trim(); 
        		for (T animal : animalList) 
        		{ 
        			if (animal.getName().equalsIgnoreCase(name)) { animal.setReserved(true); 
        			System.out.println("Animal reserved: "); 
        			System.out.println(animal); 
        			return true; 
        			} 
        	} 
        	System.out.println("Invalid entry or animal not found. Please try again."); 
        	return false; 
        	
        	}
        	
        	
        	public static void printDogs() { 
        		System.out.println("Dogs: "); 
        		System.out.println("Name - Training Status - Acquisition Country - Reservation Status"); 
        		for (Dog dog : dogList) { 
        			String reservationStatus = dog.getReserved() ? "Reserved" : "Not Reserved"; 
        			System.out.println(dog.getName() + 
        					" - " + dog.getTrainingStatus()
        					+ " - " + dog.getAcquisitionLocation() 
        					+ " - " + reservationStatus); 
        			}
        		
        	}
        	
        	public static void 
        	printMonkeys(ArrayList<Monkey> monkeyList) { 
        		System.out.println("Monkeys: "); 
        		System.out.println("Name - Training Status - Acquisition Country - Reservation Status"); 
        		for (Monkey monkey : monkeyList) { 
        			System.out.println(monkey.getName() + " - " + monkey.getTrainingStatus() + 
        					" - " + monkey.getAcquisitionCountry() + " - " 
        					+ (monkey.getReserved() ? "Reserved" : "Not Reserved")); 
        			} 
        	}
        	

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        	public static void printAnimals() { 
        		System.out.println("Animals in service and reserved:"); 
        		printReservedInServiceAnimals(dogList); 
        		printReservedInServiceAnimals(monkeyList); 
        		} 
        	private static <T extends RescueAnimal> void printReservedInServiceAnimals(List<T> animalList) 
        	{ 
        		for (T animal : animalList) {
        			if (animal.getReserved() && "in service".equalsIgnoreCase(animal.getTrainingStatus())) { 
        				System.out.println(animal); } 
        			} 
        		}
        	}
