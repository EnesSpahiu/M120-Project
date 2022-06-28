package project.shop.manager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping({"", "/"})
    public ResponseEntity<Collection<Manager>> getAll() {
        return new ResponseEntity<>(managerService.findAllManagers(), HttpStatus.OK);
    }

    @GetMapping({"/{id}", "/{id}/"})
    public ResponseEntity<Manager> getById(@PathVariable String id){
        return new ResponseEntity<>(managerService.findById(id), HttpStatus.OK);
    }

    @PostMapping({"", "/"})
    public ResponseEntity<Manager> saveManager(@RequestBody Manager manager){
        return new ResponseEntity<>(managerService.save(manager), HttpStatus.OK);
    }
}
