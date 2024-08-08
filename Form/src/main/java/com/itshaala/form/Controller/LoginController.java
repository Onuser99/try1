package com.itshaala.form.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // This will map to login.html template
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String email, @RequestParam String password, Model model) {
        // Implement your login logic here (authentication, authorization, etc.)
        // For simplicity, we're just printing out the values
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        // Redirect to a success page or return a different view
        model.addAttribute("email", email);
        return "login-success"; // This will map to login-success.html template
    }
}
