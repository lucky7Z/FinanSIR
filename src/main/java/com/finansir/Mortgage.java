package com.finansir;

public class Mortgage {
	
	// Variables
	
	private int mortgageAmount;
	private double interestRate;
	private int mortgagePeriod;
	
	private double monthlyPayment;
	private double homeOwnersInsurance;
	private double propertyTax;
	private double homeHOAFees;
	private double total;
	
	// Constructor
	
	public Mortgage(int mortgageAmount, double interestRate, int mortgagePeriod) {
		this.mortgageAmount = mortgageAmount;
		this.interestRate = interestRate;
		this.mortgagePeriod = mortgagePeriod;
		
		calculateAll();
	}
	
	
	public void calculateAll() {
		this.monthlyPayment = calculateMontlyPayments(this.mortgageAmount, this.interestRate, this.mortgagePeriod);
		this.homeOwnersInsurance = calculateHomeownersInsurance();
		this.propertyTax = calculatePropertyTax(this.mortgageAmount, 1.53);
		this.homeHOAFees = calculateHOAFees();
		calculateTotal();
	}
	
	
	// Calculations

	public double calculateMontlyPayments(double mortgageAmount, double interestRate, int mortgagePeriod) {
		double monthlyPayment;
		
		interestRate = interestRate / 100.0;
		double RatePerMonth = interestRate / 12.0;
		int termInMonths = mortgagePeriod * 12;
		
		monthlyPayment = (mortgageAmount * RatePerMonth) / (1-Math.pow(1+RatePerMonth, -termInMonths));
		return monthlyPayment;
	}
	
	public double calculateHomeownersInsurance() {
		// Finish making the ability to calculate the homeowners insurance
		double homeOwnersInsurance = 0.0;
		
		return homeOwnersInsurance;
	}
	
	
	public double calculatePropertyTax(int homeValue, double countyTaxRate) {
		double propertyTax = 0.0;
		
		countyTaxRate =  countyTaxRate / 100;
		propertyTax = (homeValue * countyTaxRate) / 12;
		
		return propertyTax;
	}
	
	public double calculateHOAFees() {
		// Finish making function to calculate the HOAfees
		double hoaFees = 0.0;
		
		return hoaFees;
	}
	
	public void calculateTotal() {
		this.total = this.monthlyPayment + this.homeOwnersInsurance + this.propertyTax + this.homeHOAFees;
	}


	public int getMortgageAmount() {
		return mortgageAmount;
	}


	public void setMortgageAmount(int MortgageAmount) {
		mortgageAmount = MortgageAmount;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double InterestRate) {
		interestRate = InterestRate;
	}


	public int getMortgagePeriod() {
		return mortgagePeriod;
	}


	public void setMortgagePeriod(int MortgagePeriod) {
		mortgagePeriod = MortgagePeriod;
	}


	public double getMonthlyPayment() {
		return monthlyPayment;
	}


	public double getHomeOwnersInsurance() {
		return homeOwnersInsurance;
	}


	public double getPropertyTax() {
		return propertyTax;
	}


	public double getHOAFees() {
		return homeHOAFees;
	}


	public double getTotal() {
		return total;
	}
}
