package hw_5;
import java.util.*;
public class MainTest5_2 extends Thread{

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Salesman> salesMans= new ArrayList<Salesman>();
		Salesman salesMan1 = new Salesman("yosi",3,0.05,1000); 
		Salesman salesMan2 = new Salesman("Levi",3,0.15,1000); 
		Salesman salesMan3 = new Salesman("Maya",3,0.1,1000);
		//setting up quntaties
		for(int i=0;i<salesMan1.getProductCount();i++) {
			salesMan1.setQuantaties(i, random.nextInt(10));
		}
		for(int i=0;i<salesMan2.getProductCount();i++) {
			salesMan2.setQuantaties(i, random.nextInt(10));
		}
		for(int i=0;i<salesMan3.getProductCount();i++) {
			salesMan3.setQuantaties(i, random.nextInt(10));
		}
		//setting up prices
		for(int i=0;i<salesMan1.getProductCount();i++) {
			salesMan1.setPrices(i, Math.round(random.nextDouble()*10));
		}
		for(int i=0;i<salesMan2.getProductCount();i++) {
			salesMan2.setPrices(i, Math.round(random.nextDouble()*10));
		}
		for(int i=0;i<salesMan3.getProductCount();i++) {
			salesMan3.setPrices(i, Math.round(random.nextDouble()*10));
		}
		salesMans.add(salesMan1);
		salesMans.add(salesMan2);
		salesMans.add(salesMan3);
		ArrayList<AccountantAdvisor> accountants= new ArrayList<AccountantAdvisor>();
		AccountantAdvisor accountent1 = new AccountantAdvisor("Adi",salesMan1);
		AccountantAdvisor accountent2 = new AccountantAdvisor("Ariel",salesMan2); 
		AccountantAdvisor accountent3 = new AccountantAdvisor("Lior",salesMan3); 
		accountants.add(accountent1);
		accountants.add(accountent2);
		accountants.add(accountent3);
		ArrayList<FinancialAdvisor> financials= new ArrayList<FinancialAdvisor>();
		FinancialAdvisor financial1 = new FinancialAdvisor("Ofek",salesMan1);
		FinancialAdvisor financial2 = new FinancialAdvisor("Loli",salesMan2);
		FinancialAdvisor financial3 = new FinancialAdvisor("Nimrod",salesMan3);
		financials.add(financial1);
		financials.add(financial2);
		financials.add(financial3);
		ArrayList<Thread> tasks = new ArrayList<Thread>();

		for(AccountantAdvisor a:accountants) {
			tasks.add(a);
		
		}
		
		for(FinancialAdvisor a: financials) {
			tasks.add(a);
		}
		
			try {
				System.out.println("printing salesman while threading");
				
				for(Salesman s:salesMans) {
					Thread.sleep(250);
					System.out.println(s.getName());
				}
				
				for(Thread thread: tasks) {
					thread.start();
					thread.join();
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		


	}

}
