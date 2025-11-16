package in.elmarino.springWebApp.controllers;

import in.elmarino.springWebApp.model.ProductClass;
import in.elmarino.springWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    
    @GetMapping("/products")
    public List<ProductClass> returnProduct(){

        return service.returnProducts();
    }

    @GetMapping("products/{id}")
    public ProductClass getProductById(@PathVariable int id){ 
        return service.getProductByID(id);

    }

    @PostMapping("/products")
    public void addProducts(@RequestBody ProductClass product){
        System.out.println(product);
        service.addProducts(product);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody ProductClass product){
        service.updateProducts(product);
    }

    @DeleteMapping ("products/{id}")
    public void deleteProductById(@PathVariable int id){
        service.deleteProductByID(id);

    }
}
