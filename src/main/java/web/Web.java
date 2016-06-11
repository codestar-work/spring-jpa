package web;
import java.util.*;
import javax.servlet.http.*;
import org.springframework.ui.*;
import org.springframework.boot.*;
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
