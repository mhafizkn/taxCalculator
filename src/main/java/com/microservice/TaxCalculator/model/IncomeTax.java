package com.microservice.TaxCalculator.model;

public class IncomeTax {

    private double annualIncome;
    private double taxAmount;
    private char taxCategory;

    public IncomeTax(double annualIncome, double taxAmount, char taxCategory) {
        this.annualIncome = annualIncome;
        this.taxAmount = taxAmount;
        this.taxCategory = taxCategory;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getTax() {
        return taxAmount;
    }

    public void setTax(double tax) {
        this.taxAmount = tax;
    }

    public char getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(char taxCategory) {
        this.taxCategory = taxCategory;
    }

    @Override
    public String toString() {
        return "IncomeTax{" +
                "annualIncome=" + annualIncome +
                ", tax=" + taxAmount +
                ", taxCategory=" + taxCategory +
                '}';
    }
}
