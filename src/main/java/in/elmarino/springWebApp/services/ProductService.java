package in.elmarino.springWebApp.services;
import in.elmarino.springWebApp.model.ProductClass;
import in.elmarino.springWebApp.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


    /*List<ProductClass> products = new ArrayList<ProductClass>
            (Arrays.asList(new ProductClass(101, 10000, "Lenovo"),
                    new ProductClass(102, 15000, "Canon"))); -- we don't even need to hardcode values while using spring data jpa   */

    public List<ProductClass> returnProducts(){
        return repo.findAll();
    }

    public ProductClass getProductByID(int id) {
        /* return products.stream()
                .filter(p -> p.getProductID() == id)
                .findFirst()
                .get(); */
        return repo.findById(id).orElse(new ProductClass());
    }

    public void addProducts(ProductClass product){
        repo.save(product);
    }

    public void updateProducts(ProductClass product) {
    /* int index = 0;
for(int i = 0; i < products.size(); i++){
    if(product.getProductID() == products.get(i).getProductID()){
        index = i;
    }
    products.set(index, product); */
        repo.save(product);
}

    public void deleteProductByID(int id) {
        repo.deleteById(id);
    }

    }



