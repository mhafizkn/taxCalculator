package com.microservice.TaxCalculator.controller;

import com.microservice.TaxCalculator.model.IncomeTax;
import com.microservice.TaxCalculator.service.TaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.script.ScriptException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/tax") // RESTful API endpoint using '/tax'
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
