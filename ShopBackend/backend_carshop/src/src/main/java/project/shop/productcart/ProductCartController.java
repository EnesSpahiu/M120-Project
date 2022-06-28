package project.shop.productcart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productcart")
public class ProductCartController {

    private ProductCartService service;

    public ProductCartController(ProductCartService service) {
        this.service = service;
    }

    @GetMapping({"/{id}", "/{id}/"})
    public ResponseEntity<ProductCart> getById (@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping({"/", ""})
    public ResponseEntity<ProductCart> save (@RequestBody ProductCart productCart) {
        return new ResponseEntity<>(service.save(productCart), HttpStatus.OK);
    }
}
