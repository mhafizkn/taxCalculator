package com.microservice.TaxCalculator.controller;

import com.microservice.TaxCalculator.model.IncomeTax;
import com.microservice.TaxCalculator.service.TaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tax") // RESTful API endpoint using '/tax'
public class TaxCalculatorController {

    @Autowired
    private TaxCalculator taxCalculator;

    @GetMapping
    public IncomeTax retrieveIncome(@RequestParam(value="annualIncome") double annualIncome) {
        return taxCalculator.calculateTax(annualIncome);
    }
}
