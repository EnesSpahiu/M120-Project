package project.shop.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Collection<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(String productId){
        return repository.findById(productId).get();
    }

    public Product save (Product product) {
        return repository.save(product);
    }

}
