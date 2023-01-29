package com.microservice.TaxCalculator.service;

import com.microservice.TaxCalculator.model.IncomeTax;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Autowired
//    private TaxCalculator taxCalculator;

    private final String response = "{" +
            "\"taxAmount\": 58950.0, " +
            "\"taxSlab\": \"250,001.00 - 400,000.00\", " +
            "\"taxClaimOptions\": [" +
            "Self and dependent (RM9000), "+
            "Medical Expenses for parents (RM8000), "+
            "Basic Supporting Equipment (RM6000), "+
            "Disabled Individual (RM6000), "+
            "Education fees (RM7000), "+
            "Medical Expenses on Serious Disease (RM8000), "+
            "Lifestyle (RM2500), "+
            "Lifestyle on personal computer, smartphone or table (RM2500), "+
            "Breastfeeding Equipment (RM1000), "+
            "Child Care Fee (RM3000), "+
            "SSPN (RM8000), "+
            "Husband/ Wife/ Alimony Payments (RM4000), "+
            "Disabled spouse (RM5000), "+
            "Education fee for children (RM8000), "+
            "Disabled Child (RM6000), "+
            "EPF (RM7000), "+
            "PRS (RM3000), "+
            "Education or Medical Insurance (RM3000), "+
            "SOCSO (RM250), "+
            "Lifestyle on Sport Equipment (RM500), "+
            "Domestic Travel (RM1000)"+
            "]"+
            "}";

    @Test
    void calculateTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        IncomeTax tax = taxCalculator.calculateTax(300000);
        assertEquals(response, tax.toString());
    }
}