package hw_5;

public class AccountantAdvisor extends Advisor implements Runnable{

	public AccountantAdvisor(String name, Salesman salesman) {
		super(name, salesman);
	}
	public void calculateIncome() {
		double income = 0;
		for(int i=0;i<salesman.getProductCount();i++) {
			income+=salesman.getPrice(i)*salesman.getQuantitie(i);
		}
		System.out.println("\nAccountant Advisors name "+this.name);
		System.out.println("Sales persons name "+salesman.getName());
		System.out.println("total income:"+income);

	}
	@Override
	public void run() {
		this.calculateIncome();
	}
}
