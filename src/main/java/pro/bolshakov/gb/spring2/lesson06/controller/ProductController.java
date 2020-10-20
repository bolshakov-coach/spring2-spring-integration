package pro.bolshakov.gb.spring2.lesson06.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.bolshakov.gb.spring2.lesson06.domain.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("Milk", 56.66));
        products.add(new Product("Beer", 66.66));
        products.add(new Product("Chocolate", 116.00));
        products.add(new Product("Bread", 36.00));
    }

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }


}
