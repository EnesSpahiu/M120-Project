package project.shop.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.shop.generic.ExtendedEntity;

import javax.persistence.Entity;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "manager")
public class Manager extends ExtendedEntity {
    private String username;
    private String password;
}
