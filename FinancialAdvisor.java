package hw_5;

public class FinancialAdvisor extends Advisor implements Runnable{

	public FinancialAdvisor(String name, Salesman salesman) {
		super(name, salesman);
	}
	
	public void calculateFutureValue() {
		System.out.println("\nFinancial Advisors name "+this.name);
		System.out.println("Sales persons name "+salesman.getName());
		System.out.println("future value "+salesman.getPmt()*(1+salesman.getRate()));
	}
	
	@Override
	public void run() {
		this.calculateFutureValue();
	}
	

}
