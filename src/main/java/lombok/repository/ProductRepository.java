package lombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lombok.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
