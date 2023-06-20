package hw_5;
import java.util.*;

public class MainTest {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Airport airport= new Airport();

		boolean flag = true;
		while(flag) {
			try {
				System.out.print("enter capcity");
				int capacity = scanner.nextInt();
				System.out.print("\nenter flight number");
				String flightNumber=scanner.next();
				System.out.print("\nenter passenger ammount");
				int Passengers = scanner.nextInt();
				airport.addFlight(flightNumber, capacity, Passengers);
				flag=false;
			}
			catch(Exception e){
				System.out.println("invalid input please try again");
				e.printStackTrace();
				System.out.println();
			}
				
			
		}
		
		
		System.out.println("flight added successfully");
		scanner.close();
		
	}

}
