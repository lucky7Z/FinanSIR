package com.finansir.entity;


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
