package com.finansir.service;

public interface MortgageService {
	
	public double calculateAll(double monthlyPayment, double homeOwnersInsurance, double propertyTax, double hoaFees);
	
	public double calculateMonthlyPayments(double mortgageAmount, double interestRate, int mortgagePeriod);

	public double calculateHomeownersInsurance(double homeOwnersInsurance);
	
	public double calculatePropertyTax(int homeValue, double countyTaxRate);
	
	public double calculateHOAFees(double hoaFees);
	
	public double calculateTotal(double total);
}
