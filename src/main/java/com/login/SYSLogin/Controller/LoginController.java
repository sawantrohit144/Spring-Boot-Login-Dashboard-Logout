package com.login.SYSLogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.SYSLogin.Entity.User;
import com.login.SYSLogin.Service.UserService;

@Controller
public class LoginController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Add authentication logic here (e.g., compare passwords)
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/dashboard";
        } else {
            return "redirect:/login?error";
        }
    }
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }

    @GetMapping("/logout")
    public String logout() {
        // Add any logout logic if needed
        return "login";
    }
}
