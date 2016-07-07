package web;

import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;

public interface AirportRepository extends CrudRepository<Airport, Long> {

}
