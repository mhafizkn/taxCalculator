package com.microservice.TaxCalculator.model;

import org.springframework.stereotype.Service;

@Service
public class IncomeTax {

    private double annualIncome;
    private double tax;
    private char taxCategory;
    private double netIncome;

    public IncomeTax() {
    }

    public IncomeTax(double annualIncome, double tax, char taxCategory) {
        this.annualIncome = annualIncome;
        this.tax = tax;
        this.taxCategory = taxCategory;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public char getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(char taxCategory) {
        this.taxCategory = taxCategory;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }

    @Override
    public String toString() {
        return "IncomeTax{" +
                "annualIncome=" + annualIncome +
                ", tax=" + tax +
                ", taxCategory=" + taxCategory +
                ", netIncome=" + netIncome +
                '}';
    }
}
