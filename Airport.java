package hw_5;
import java.util.ArrayList;
public class Airport {
	private ArrayList<Flight> flights;
	public Airport() {
		this.flights = new ArrayList<Flight>();
	}
	public void addFlight(String flightNumber, int capacity , int passengers) throws Exception{
		Flight a = new Flight(flightNumber, capacity);
		for(int i=0;i<passengers;i++) {
			a.addPassenger();
		}
		this.flights.add(a);
	}
	
	public Flight getLastFlight() {
		return flights.get(flights.size()-1);
	}

}
