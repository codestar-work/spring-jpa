package web;

import java.util.*;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.*;

public interface 
AirportRepository extends CrudRepository<Airport, Long> {
	Airport findOneByCode(String code);
	@Query("select a from Airport a")
	List test();
}
