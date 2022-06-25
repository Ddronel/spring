package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hi")
    public String helloPage() {
        return "first/hi";
    }

    @GetMapping("/goodBye")
    public String goodByePage() {
        return "first/bye";
    }
}
