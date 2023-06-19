package hw_5;

public class  Salesman {
	private String name;
	private int productsCount;
	private int [] quantities;
	private double rate;
	private double pmt;
	private double[] prices;
	public Salesman(String name , int productsCount ,double rate,double pmt) {
		this.quantities = new int[productsCount];
		this.prices = new double[productsCount];
		this.setName(name);
		this.setProductCount(productsCount);
		this.setRate(rate);
		this.setPmt(pmt);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setProductCount(int productCount) {
		this.productsCount=productCount;
	}
	public void setRate(double rate) {
		this.rate=rate;
	}
	public void setPmt(double pmt) {
		this.pmt=pmt;
	}
	public void setQuantaties(int index,int m) {
		quantities[index]=m;
	}
	public void setPrices(int index,double m) {
		prices[index]=m;
	}
	
	public String getName() {
		return name;
	}
	public int getProductCount() {
		return this.productsCount;
	}
	public double getQuantitie(int n) {
		return quantities[n];
	}
	public double getRate() {
		return this.rate;
	}
	public double getPmt() {
		return this.pmt;
	}
	public double getPrice(int n) {
		return this.prices[n];
	}
}
