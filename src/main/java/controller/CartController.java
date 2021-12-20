package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CartService;

@RestController
@RequestMapping("/shop/candle/cart")
public class CartController {

  @Autowired 
  private CartService cartService;
  
  @GetMapping("/loadAllProductInCart")
  public void loadAllProductInCart() {
    
  }
  @PostMapping("/deteleToCart")
  public void deteleToCart() {
    
  }
  @PostMapping("/addToCart")
  public void addToCart() {
    
  }
}
