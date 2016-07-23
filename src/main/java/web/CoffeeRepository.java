package web;

import java.util.*;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.*;

public interface 
CoffeeRepository extends CrudRepository<Coffee, Long> {
	List findBySize(Character c);

	@Query("select c from Coffee c")
	List list();
}
