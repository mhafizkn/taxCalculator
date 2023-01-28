package com.microservice.TaxCalculator.model;

import java.util.List;
import java.util.Objects;

public class IncomeTax {

    private double annualIncome;
    private double taxAmount;
    private String taxSlab;
    private List<String> taxClaimOptions;

    public IncomeTax(List<String> taxClaimOptions) {
        this.taxClaimOptions = taxClaimOptions;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxSlab() {
        return taxSlab;
    }

    public void setTaxSlab(String taxSlab) {
        this.taxSlab = taxSlab;
    }

    public List<String> getTaxClaimOptions() {
        return taxClaimOptions;
    }

    public void setTaxClaimOptions(List<String> taxClaimOptions) {
        this.taxClaimOptions = taxClaimOptions;
    }

    @Override
    public String toString() {
        return "IncomeTax{" +
                ", taxAmount=" + taxAmount +
                ", taxSlab='" + taxSlab + '\'' +
                ", taxClaimOptions=" + taxClaimOptions +
                '}';
    }
}
