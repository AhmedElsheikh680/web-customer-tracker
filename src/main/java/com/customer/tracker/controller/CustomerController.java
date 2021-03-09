package com.customer.tracker.controller;

import com.customer.tracker.model.Customer;
import com.customer.tracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"","/","/customer"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping({"","/","/list"})
    public String listCustomer(Model model){

        model.addAttribute("customers", customerService.findAll());
        return "list-customers";
    }
}
