package com.demo.ss9_btth.controller;

import java.util.Scanner;

import com.demo.ss9_btth.model.OrderDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Scanner;
@Controller
@SessionAttributes("orderDto")
@RequestMapping("/")
public class OrderController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String finishOrder(@ModelAttribute("orderDto") OrderDto orderDto, SessionStatus status) {
        status.setComplete();
        return "order-success";
    }
}
