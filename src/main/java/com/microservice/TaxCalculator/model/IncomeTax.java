package com.microservice.TaxCalculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IncomeTax {

    private double annualIncome;
    private double taxAmount;
    private String taxSlab;
    // Declare array of taxClaimOptions as static to initialize the data
    private static List<String> taxClaimOptions = Arrays.asList(
            "Self and dependent (RM9000)",
            "Medical Expenses for parents (RM8000)",
            "Basic Supporting Equipment (RM6000)",
            "Disabled Individual (RM6000)",
            "Education fees (RM7000)",
            "Medical Expenses on Serious Disease (RM8000)",
            "Lifestyle (RM2500)",
            "Lifestyle on personal computer, smartphone or table (RM2500)",
            "Breastfeeding Equipment (RM1000)",
            "Child Care Fee (RM3000)",
            "SSPN (RM8000)",
            "Husband/ Wife/ Alimony Payments (RM4000)",
            "Disabled spouse (RM5000)",
            "Education fee for children (RM8000)",
            "Disabled Child (RM6000)",
            "EPF (RM7000)",
            "PRS (RM3000)",
            "Education or Medical Insurance (RM3000)",
            "SOCSO (RM250)",
            "Lifestyle on Sport Equipment (RM500)",
            "Domestic Travel (RM1000)"
    );

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
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
//        return "IncomeTax{" +
//                ", taxAmount=" + taxAmount +
//                ", taxSlab='" + taxSlab + '\'' +
//                ", taxClaimOptions=" + taxClaimOptions +
//                '}';

        return "{\"taxAmount\": " + taxAmount +
                ", \"taxSlab\": \"" + taxSlab + "\"" +
//                "\"taxClaimOptions\"" + taxClaimOptions
                '}';
    }
}
