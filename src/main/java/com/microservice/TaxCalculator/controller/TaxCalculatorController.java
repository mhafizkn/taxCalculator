package com.microservice.TaxCalculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TaxCalculatorController {

    @GetMapping("/tax")
    public String hello(@RequestParam(value="income", defaultValue = "10000") double income) {
        return String.format("Calculate tax of %.2f!", income);
    }
}
