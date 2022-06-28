package project.shop.manager;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ManagerService {
    private final ManagerRepository repository;

    public List<Manager> findAllManagers(){
        return repository.findAll();
    }

    public Manager findById(String managerId){
        return repository.findById(managerId).get();
    }

    public Manager save(Manager entity){
        log.info("Saving new Customer {} to the database", entity.getUsername());
        repository.save(entity);
        return entity;
    }

    public void updateById(String managerId, Manager entity){
        log.info("Saving new Customer {} to the database", entity.getUsername());
        Manager updatedCustomer = findById(managerId);
    }
}
