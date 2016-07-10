package web;

import java.util.*;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.*;

public interface 
CoffeeRepository extends CrudRepository<Coffee, Long> {
	Coffee findOneByName(String name);
}
