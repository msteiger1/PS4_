package MainPackage;

public class InvestmentCalc {
	
	private double investmentAmount=0;
	private int years = 0;
	private double annualInterestRate=0;
	
	public InvestmentCalc(){
		
	}
	public double getinvestmentAmount(){
		return investmentAmount;
	}
	public double getyears(){
		return years;
	}
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public double investmentCalculator(double investmentAmount, int years, double annualInterestRate){
		double amount=investmentAmount * Math.pow(1+annualInterestRate/100, years);
		return amount;
	}

	

	

	
	

	
	



}
