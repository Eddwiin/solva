package com.api.solva.customer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    @GetMapping("/create")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("Ok api marche");
    }
}
