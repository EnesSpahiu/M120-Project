package project.shop.shoppingcart;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingCartService {

    private ShoppingCartRepository repository;

    public ShoppingCartService(ShoppingCartRepository repository) {
        this.repository = repository;
    }

    public ShoppingCart getShoppingCart(String id) {
        Optional<ShoppingCart> shoppingCart = repository.findById(id);
        if (shoppingCart.isPresent()) {
            return shoppingCart.get();
        } else {
            return null;
        }
    }

    public ShoppingCart save(ShoppingCart shoppingCart) {
        return repository.save(shoppingCart);
    }

    public void deleteShoppingCart(String id) {
        repository.deleteById(id);
    }
}
