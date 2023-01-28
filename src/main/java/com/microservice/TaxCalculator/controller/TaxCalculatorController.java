package com.microservice.TaxCalculator.controller;

import com.microservice.TaxCalculator.service.TaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tax") // RESTful API endpoint using /tax
public class TaxCalculatorController {

    private final TaxCalculator taxCalculator;

    @Autowired
    public TaxCalculatorController(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @GetMapping
    public Object calculateIncome(@RequestParam(value="annualIncome") double annualIncome) {
        return taxCalculator.calculateTax(annualIncome);
    }

}
