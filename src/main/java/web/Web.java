package web;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class Web {
	
	@RequestMapping("/")
	String home() {
		return "index";
	}
	
	@Autowired
	private AirportRepository repository;
	
	@RequestMapping("/list") @ResponseBody
	Iterable list() {
		return repository.findAll();
	}	
}
