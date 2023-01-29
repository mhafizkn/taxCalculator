package com.microservice.TaxCalculator.service;

import com.microservice.TaxCalculator.model.IncomeTax;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Autowired
//    private TaxCalculator taxCalculator;

    @Test
    void calculateTax() {
        String response = "{\"taxAmount\": 58950.0, \"taxSlab\": \"250,001.00 - 400,000.00\"}";
        TaxCalculator taxCalculator = new TaxCalculator();
        IncomeTax tax = taxCalculator.calculateTax(300000);
        assertEquals(response, tax.toString());
    }
}