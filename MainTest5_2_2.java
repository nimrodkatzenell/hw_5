package hw_5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.*;
public class MainTest5_2_2 extends Thread implements Runnable{

	public static final int MAX_THREADS = 3;

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Salesman> salesMans= new ArrayList<Salesman>();
		Salesman salesMan1 = new Salesman("yosi",3,0.05,1000); 
		Salesman salesMan2 = new Salesman("Levi",3,0.15,1000); 
		Salesman salesMan3 = new Salesman("Maya",3,0.1,1000);
		Salesman salesMan4 = new Salesman("Nisim",3,0.05,1000); 
		Salesman salesMan5 = new Salesman("Rami",3,0.15,1000); 
		Salesman salesMan6 = new Salesman("May",3,0.1,1000);
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
		for(int i=0;i<salesMan4.getProductCount();i++) {
			salesMan4.setQuantaties(i, random.nextInt(10));
		}
		for(int i=0;i<salesMan5.getProductCount();i++) {
			salesMan5.setQuantaties(i, random.nextInt(10));
		}
		for(int i=0;i<salesMan6.getProductCount();i++) {
			salesMan6.setQuantaties(i, random.nextInt(10));
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
		for(int i=0;i<salesMan4.getProductCount();i++) {
			salesMan4.setPrices(i, Math.round(random.nextDouble()*10));
		}
		for(int i=0;i<salesMan5.getProductCount();i++) {
			salesMan5.setPrices(i, Math.round(random.nextDouble()*10));
		}
		for(int i=0;i<salesMan6.getProductCount();i++) {
			salesMan6.setPrices(i, Math.round(random.nextDouble()*10));
		}
		salesMans.add(salesMan1);
		salesMans.add(salesMan2);
		salesMans.add(salesMan3);
		salesMans.add(salesMan4);
		salesMans.add(salesMan5);
		salesMans.add(salesMan6);
		ArrayList<AccountantAdvisor> accountants= new ArrayList<AccountantAdvisor>();
		AccountantAdvisor accountent1 = new AccountantAdvisor("Adi",salesMan1);
		AccountantAdvisor accountent2 = new AccountantAdvisor("Ariel",salesMan2); 
		AccountantAdvisor accountent3 = new AccountantAdvisor("Lior",salesMan3); 
		AccountantAdvisor accountent4 = new AccountantAdvisor("Adi",salesMan1);
		AccountantAdvisor accountent5 = new AccountantAdvisor("Ariel",salesMan2); 
		AccountantAdvisor accountent6 = new AccountantAdvisor("Lior",salesMan3); 
		accountants.add(accountent1);
		accountants.add(accountent2);
		accountants.add(accountent3);
		accountants.add(accountent4);
		accountants.add(accountent5);
		accountants.add(accountent6);
		ArrayList<FinancialAdvisor> financials= new ArrayList<FinancialAdvisor>();
		FinancialAdvisor financial1 = new FinancialAdvisor("Ofek",salesMan1);
		FinancialAdvisor financial2 = new FinancialAdvisor("Loli",salesMan2);
		FinancialAdvisor financial3 = new FinancialAdvisor("Nimrod",salesMan3);
		FinancialAdvisor financial4 = new FinancialAdvisor("Ofek",salesMan4);
		FinancialAdvisor financial5 = new FinancialAdvisor("Loli",salesMan5);
		FinancialAdvisor financial6 = new FinancialAdvisor("Nimrod",salesMan6);
		financials.add(financial1);
		financials.add(financial2);
		financials.add(financial3);
		financials.add(financial4);
		financials.add(financial5);
		financials.add(financial6);
		
		
		ExecutorService threadPool = Executors.newFixedThreadPool(MAX_THREADS);
		for(int i=0;i<6;i++) {
			
			threadPool.execute(financials.get(i));
			threadPool.execute(accountants.get(i));
		}
		 try {
				
	            threadPool.awaitTermination(10, TimeUnit.SECONDS);
	            System.out.println("\nFinished program printing sales peoples names...\n");
	            for(Salesman s:salesMans) {
					System.out.println(s.getName());
				}
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		threadPool.shutdown();
	}

}
