package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import request.dto.Product;
import service.ProductService;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/shop/candle/product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/getAllProduct")
  public ArrayList<Product> getAllProduct() {
    return null;
  }


  @PostMapping("/createProduct")
  public Product createProduct() {
    return null;
  }

  @GetMapping("updateProduct")
  public void updateProduct() {

  }

  @GetMapping("/deteleProduct")
  public void deleteProduct() {

  }

  @GetMapping("/searchProductByTitle")
  public void searchProduct() {

  }

  @GetMapping("/getDetailProduct")
  public void getDetailProduct() {

  }
}
