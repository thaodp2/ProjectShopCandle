package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AccountService;

@RestController
@RequestMapping("/shop/candle")
public class HomeController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public void login(){

    }

    @GetMapping("/logout")
    public void logout(){

    }
    
    @GetMapping("/signUp")
    public void signUp(){

    }
}
