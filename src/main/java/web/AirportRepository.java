package web;

import java.util.*;
import javax.transaction.*;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.jpa.repository.*;

@Transactional
public interface AirportRepository extends CrudRepository<Airport, Long> {
	
}
