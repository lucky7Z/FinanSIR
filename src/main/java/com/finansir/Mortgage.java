package com.finansir;

public class Mortgage {
	
	// Variables
	
	private int MortgageAmount;
	private double InterestRate;
	private int MortgagePeriod;
	
	private double MonthlyPayment;
	private double HomeOwnersInsurance;
	private double PropertyTax;
	private double HOAFees;
	private double Total;
	
	// Constructor
	
	public Mortgage(int mortgageAmount, double interestRate, int mortgagePeriod) {
		this.MortgageAmount = mortgageAmount;
		this.InterestRate = interestRate;
		this.MortgagePeriod = mortgagePeriod;
		
		calculateAll();
	}
	
	
	public void calculateAll() {
		this.MonthlyPayment = calculateMontlyPayments(this.MortgageAmount, this.InterestRate, this.MortgagePeriod);
		this.HomeOwnersInsurance = calculateHomeownersInsurance();
		this.PropertyTax = calculatePropertyTax(this.MortgageAmount, 1.53);
		this.HOAFees = calculateHOAFees();
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
		// TO DO
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
		// TO DO
		double hoaFees = 0.0;
		return hoaFees;
	}
	
	public void calculateTotal() {
		this.Total = this.MonthlyPayment + this.HomeOwnersInsurance + this.PropertyTax + this.HOAFees;
	}


	public int getMortgageAmount() {
		return MortgageAmount;
	}


	public void setMortgageAmount(int mortgageAmount) {
		MortgageAmount = mortgageAmount;
	}


	public double getInterestRate() {
		return InterestRate;
	}


	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}


	public int getMortgagePeriod() {
		return MortgagePeriod;
	}


	public void setMortgagePeriod(int mortgagePeriod) {
		MortgagePeriod = mortgagePeriod;
	}


	public double getMonthlyPayment() {
		return MonthlyPayment;
	}


	public double getHomeOwnersInsurance() {
		return HomeOwnersInsurance;
	}


	public double getPropertyTax() {
		return PropertyTax;
	}


	public double getHOAFees() {
		return HOAFees;
	}


	public double getTotal() {
		return Total;
	}
}
