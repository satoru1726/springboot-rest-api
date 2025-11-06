package in.elmarino.springWebApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Entity
@Data
// @AllArgsConstructor // damn, these will generate all the getters, setters and constructors for you! -- the power of lombok.
@Table(name = "PRODUCTS")
public class ProductClass {

    @Id
    @Column(name = "product_id")
    private int productID;
    @Column(name = "product_price")
    private int productPrice;
    @Column(name = "product_name")
    private String productName; // take advantage of lombok! here.

}
