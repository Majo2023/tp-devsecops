package com.example.democyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Secret factice pour la démonstration Gitleaks (TP2 DevSecOps)
    // private static final String GITHUB_TOKEN = "ghp_1234567890abcdef1234567890abcdef1234";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Demo Cyber - DevSecOps TP");
        model.addAttribute("message", "Application Java Spring Boot déployée avec succès!");
        model.addAttribute("status", "✅ En marche");
        return "index";
    }

    @GetMapping("/health")
    public String health() {
        return "health";
    }
}
