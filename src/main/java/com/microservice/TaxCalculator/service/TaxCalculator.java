package com.microservice.TaxCalculator.service;

import com.microservice.TaxCalculator.model.IncomeTax;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Service
public class TaxCalculator {

    private double taxAmount;
    private char taxCategory;

    public Object calculateTax(@RequestParam(value="annualIncome", defaultValue = "1000") double annualIncome) {

        if(annualIncome <= 5000) {
            taxAmount = 0;
            taxCategory = 'A';
        } else if (annualIncome > 5001 && annualIncome <= 20000) {
            taxAmount = 0 + (annualIncome - 5000);
            taxCategory = 'B';
        } else if (annualIncome > 20001 && annualIncome <= 35000) {
            taxAmount = 150 + (annualIncome - 20000) * 0.03;
            taxCategory = 'C';
        } else if (annualIncome > 35001 && annualIncome <= 50000) {
            taxAmount = 600 + (annualIncome - 35000) * 0.08;
            taxCategory = 'D';
        } else if (annualIncome > 50001 && annualIncome <= 70000) {
            taxAmount = 1800 + (annualIncome - 50000) * 0.13;
            taxCategory = 'E';
        } else if (annualIncome > 70001 && annualIncome <= 100000) {
            taxAmount = 4400 + (annualIncome - 70000) * 0.21;
            taxCategory = 'F';
        } else if (annualIncome > 100001 && annualIncome <= 250000) {
            taxAmount = 10700 + (annualIncome - 100000) * 0.24;
            taxCategory = 'G';
        } else if (annualIncome > 250001 && annualIncome <= 400000) {
            taxAmount = 46700 + (annualIncome - 250000) * 0.245;
            taxCategory = 'H';
        } else if (annualIncome > 400001 && annualIncome <= 600000) {
            taxAmount = 83450 + (annualIncome - 400000) * 0.25;
            taxCategory = 'I';
        } else if (annualIncome > 600001 && annualIncome <= 1000000) {
            taxAmount = 133450 + (annualIncome - 600000) * 0.26;
            taxCategory = 'J';
        } else if (annualIncome > 1000001 && annualIncome <= 2000000) {
            taxAmount = 237450 + (annualIncome - 1000000) * 0.28;
            taxCategory = 'K';
        } else {
            taxAmount = 517450 + (annualIncome - 2000000) * 0.3;
            taxCategory = 'L';
        }

        IncomeTax incomeTax = new IncomeTax(annualIncome, taxCategory, taxCategory);

        System.out.println("Tax Amount: RM" + String.format("%.2f", taxAmount) + "\nTax Slab: " + taxCategory);

        Map<String, Object> object = new HashMap<>();
        object.put("taxAmount", annualIncome);
        object.put("taxSlab", taxCategory);

        return object;
    }
}
