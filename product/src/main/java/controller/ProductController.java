package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public ResponseEntity<Product> addFlight(@RequestBody Product product) {
        Product newProduct = productService.saveProduct(product);
        ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct, HttpStatus.OK);
        return responseEntity;
        }
}
