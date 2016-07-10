package web;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import java.sql.*;
import java.util.*;
import org.springframework.jdbc.core.*;

@Controller
public class Web {
	@RequestMapping("/")
	String home() {
		return "index";
	}
	
	@Autowired
	private CoffeeRepository coffee;
	
	@RequestMapping("/list") @ResponseBody
	Iterable list() {
		return coffee.findAll();
	}
	
}
