package com.finansir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finansir.entity.Mortgage;


@Service
public class MortgageServiceImpl implements MortgageService {

	public Mortgage  mortgage;
	
	@Autowired
	public MortgageServiceImpl (Mortgage theMortgage) {
		
		mortgage = theMortgage;
	}

	@Override
	public double calculateAll (double monthlyPayment, double homeOwnersInsurance, double propertyTax, double hoaFees) {
		
		monthlyPayment = calculateMonthlyPayments(mortgage.getMortgageAmount(), mortgage.getInterestRate(), mortgage.getMortgagePeriod());
		homeOwnersInsurance = calculateHomeownersInsurance(mortgage.getHomeOwnersInsurance());
		propertyTax = calculatePropertyTax(mortgage.getMortgageAmount(), 1.53);
		hoaFees = calculateHOAFees(mortgage.getHOAFees());
		double all = monthlyPayment + homeOwnersInsurance + propertyTax + hoaFees;
		return all;
	}

	@Override
	public double calculateMonthlyPayments(double mortgageAmount, double interestRate, int mortgagePeriod) {
		
		double monthlyPayment;
		
		interestRate = interestRate / 100.0;
		double RatePerMonth = interestRate / 12.0;
		int termInMonths = mortgagePeriod * 12;
		
		monthlyPayment = (mortgageAmount * RatePerMonth) / (1-Math.pow(1+RatePerMonth, -termInMonths));
		return monthlyPayment;
	}

	@Override
	public double calculateHomeownersInsurance(double homeOwnersInsurance) {
		// TO DO
				 homeOwnersInsurance = 0.0;
				return homeOwnersInsurance;
	}

	@Override
	public double calculatePropertyTax(int homeValue, double countyTaxRate) {
		double propertyTax = 0.0;
		
		countyTaxRate =  countyTaxRate / 100;
		propertyTax = (homeValue * countyTaxRate) / 12;
		
		return propertyTax;
	}

	@Override
	public double calculateHOAFees(double hoaFees) {
		// TO DO
				hoaFees = 0.0;
				return hoaFees;
	}

	@Override
	public double calculateTotal(double total) {
		total = mortgage.getMonthlyPayment() + mortgage.getHomeOwnersInsurance() + mortgage.getPropertyTax()+ mortgage.getHOAFees();
		return total;
	}

	
	
}
