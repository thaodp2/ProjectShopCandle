package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PayService;

@RestController
@RequestMapping("/shop/candle/payment")
public class PaymentController {

  @Autowired
  private PayService payService;

  @GetMapping("/accountsPayment")
  public void getAccountPayment() {

  }

  @GetMapping("/searchAccountPayMent")
  public void searchAccountPayment() {

  }

  @GetMapping("/makePayBayWallet")
  public void makePayBayWallet() {

  }

  @GetMapping("/checkDaftTransaction")
  public void checkDaftTransaction() {

  }

  @GetMapping("/getAllHistoryPayByAccount")
  public void getAllHistoryPayAccount() {

  }
  
  @PostMapping("/updateAccountPayment")
  public void updateAccountPayment() {
    
  }
  
  @GetMapping("/createAccountPayment")
  public void createAccountPayment() {
    
  }
}
