
public class Monkey extends RescueAnimal {
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	public Monkey(String name, String species, String tailLength, String height, String bodyLength, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved , String inServiceCountry) {
		
		super();
		
		this.species = species;
		this.tailLength = tailLength;
		this.bodyLength = bodyLength;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	public String getTailLength() {
		return tailLength;
	}
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	public String getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	@Override
	public String toString() {
		
		return "Name: " + getName() +
				", Species: " + getSpecies() +
				", Tail Length: " + 
				getTailLength() +
				", Height: " + getHeight() +
				", Body Length: " +
				getBodyLength() +
				", Acquisition Date: " +
				getAcquisitionDate() + 
				", Acquisition Country: " +
				getAcquisitionCountry() +
				", Training Status: " + 
				getTrainingStatus() +
				", Reserved: " + getReserved() +
				", In Service Country: " +
				getInserviceCountry() + "\n";
				
				
		
	}
	private String getInserviceCountry() {
		// TODO Auto-generated method stub
		return null;
	}
	String getAcquisitionCountry() {
		// TODO Auto-generated method stub
		return null;
	}
}
