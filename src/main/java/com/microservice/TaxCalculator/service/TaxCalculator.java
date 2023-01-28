package com.microservice.TaxCalculator.service;

import com.microservice.TaxCalculator.model.IncomeTax;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TaxCalculator {

    static List<String> taxClaimOptions = Arrays.asList(
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

    public IncomeTax calculateTax(double annualIncome) {

        double taxAmount;
        String taxSlab;

        IncomeTax incomeTax = new IncomeTax(taxClaimOptions);

        if (annualIncome <= 5000) {
            taxAmount = 0;
            taxSlab = "0 - 5000";
        } else if (annualIncome > 5001 && annualIncome <= 20000) {
            taxAmount = 0 + (annualIncome - 5000);
            taxSlab = "5,001 - 20,000";
        } else if (annualIncome > 20001 && annualIncome <= 35000) {
            taxAmount = 150 + (annualIncome - 20000) * 0.03;
            taxSlab = "20,001 - 35,000";
        } else if (annualIncome > 35001 && annualIncome <= 50000) {
            taxAmount = 600 + (annualIncome - 35000) * 0.08;
            taxSlab = "35,001 - 50,000";
        } else if (annualIncome > 50001 && annualIncome <= 70000) {
            taxAmount = 1800 + (annualIncome - 50000) * 0.13;
            taxSlab = "50,001 - 70,000";
        } else if (annualIncome > 70001 && annualIncome <= 100000) {
            taxAmount = 4400 + (annualIncome - 70000) * 0.21;
            taxSlab = "70,001 - 100,000";
        } else if (annualIncome > 100001 && annualIncome <= 250000) {
            taxAmount = 10700 + (annualIncome - 100000) * 0.24;
            taxSlab = "70,001 - 100,000";
        } else if (annualIncome > 250001 && annualIncome <= 400000) {
            taxAmount = 46700 + (annualIncome - 250000) * 0.245;
            taxSlab = "250,001 - 400,000";
        } else if (annualIncome > 400001 && annualIncome <= 600000) {
            taxAmount = 83450 + (annualIncome - 400000) * 0.25;
            taxSlab = "250,001 - 400,000";
        } else if (annualIncome > 600001 && annualIncome <= 1000000) {
            taxAmount = 133450 + (annualIncome - 600000) * 0.26;
            taxSlab = "600,001 - 1,000,000";
        } else if (annualIncome > 1000001 && annualIncome <= 2000000) {
            taxAmount = 237450 + (annualIncome - 1000000) * 0.28;
            taxSlab = "1,000,001 - 2,000,000";
        } else {
            taxAmount = 517450 + (annualIncome - 2000000) * 0.3;
            taxSlab = "Exceed 2,00,000";
        }

        incomeTax.setTaxAmount(taxAmount);
        incomeTax.setTaxSlab(taxSlab);

        return incomeTax;
    }
}
