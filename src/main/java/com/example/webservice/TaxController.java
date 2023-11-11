package com.example.webservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class TaxController {

    @PostMapping("/calculateTax")
    public double calculateTax(@RequestBody double salary) {
        if (salary <= 5000) {
            return 0;
        } else if (salary <= 9000) {
            return salary * 0.03;
        } else if (salary <= 15000) {
            return salary * 0.05;
        } else {
            return salary * 0.1;
        }
    }
}