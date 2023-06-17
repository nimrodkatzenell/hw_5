package hw_5;

public class Advisor extends Thread{
	protected String name;
	protected Salesman salesman;
	public Advisor(String name, Salesman salesman) {
		this.name=name;
		this.salesman=salesman;
	}
	
	
	
}
