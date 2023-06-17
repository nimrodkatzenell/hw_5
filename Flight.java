package hw_5;

public class Flight {
	private int capacity;
	private String flightNumber;
	private int currentPassengers;
	
	public Flight(String flightNumber,int capacity) throws Exception{
		this.setFlightNumber(flightNumber);
		this.setCapacity(capacity);
		this.currentPassengers=0;
	}
	
	public void setFlightNumber(String flightNumber) throws Exception{
		if (!flightNumber.matches("[A-Z]{2}.*") || !flightNumber.matches(".*\\d{4}")) {
			throw new InvalidFlightNumberException("\"Invalid flight number format. Expected format: XX 0000");
		}
		else {
			this.flightNumber = flightNumber;
		}
	}

	public void setCapacity(int capacity) throws Exception{
		if(capacity>0) {
			this.capacity = capacity;
		}
		else {
			throw new IllegalArgumentException("Invalid capacity. Capacity must be positive");
		}
	}
	
	public void addPassenger() {
		if(this.currentPassengers+1>this.capacity) {
			throw new OverCapacityException("Cannot add more passengers. Flight is at full capacity");
		}
		else {
			this.currentPassengers++;
		}
	}

}
