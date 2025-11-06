package in.elmarino.springWebApp.repositories;

import in.elmarino.springWebApp.model.ProductClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<ProductClass, Integer> {
    // <ModelClass, type of your primary key>


}
