package project.shop.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Collection<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findById(String customerId) {
        return customerRepository.findById(customerId).get();
    }

    public Customer saveCustomer(Customer entity){
        log.info("Saving new Customer {} to the database", entity.getEmail());
        customerRepository.save(entity);
        return entity;
    }

    public Customer updateById(String customerId, Customer customer){
        log.info("Updating user with ID {}", customer.getId());
        Customer updatedCustomer = findById(customerId);

        updatedCustomer.setEmail(customer.getEmail());
        updatedCustomer.setPassword(customer.getPassword());
        updatedCustomer.setProductCart(customer.getProductCart());

        return customer;
    }

    public void deleteById(String userId){
        customerRepository.deleteById(userId);
    }
}
