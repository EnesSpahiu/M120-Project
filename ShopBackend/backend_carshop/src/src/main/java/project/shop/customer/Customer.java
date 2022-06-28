package project.shop.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.shop.generic.ExtendedEntity;
import project.shop.productcart.ProductCart;
import project.shop.shoppingcart.ShoppingCart;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer extends ExtendedEntity {

    private String email;
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productcart_id", referencedColumnName = "id", nullable = false)
    private ProductCart productCart;

}
