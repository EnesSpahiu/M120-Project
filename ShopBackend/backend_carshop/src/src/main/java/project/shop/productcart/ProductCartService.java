package project.shop.productcart;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductCartService {

    private ProductCartRepository repository;

    public ProductCartService(ProductCartRepository repository) {
        this.repository = repository;
    }

    public ProductCart getById(String id) {
        Optional<ProductCart> productCart = repository.findById(id);

        if (productCart.isPresent()) {
            return productCart.get();
        } else {
            return null;
        }
    }

    public ProductCart save (ProductCart productCart) {
        return repository.save(productCart);
    }


}
