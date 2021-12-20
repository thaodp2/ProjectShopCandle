package dao;

import java.util.ArrayList;
import request.dto.Product;

public class ProductDAO {

  public ArrayList<Product> getAllProduct() {

    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product(1, "Nến 1", 3, "1", "abc"));
    products.add(new Product(2, "Nến 2", 4, "2", "abcd"));
    products.add(new Product(3, "Nến 3", 5, "3", "abcde"));
    products.add(new Product(4, "Nến 4", 6, "4", "abcdef"));
    products.add(new Product(5, "Nến 5", 7, "5", "abcdefg"));

    return products;
  }
}
