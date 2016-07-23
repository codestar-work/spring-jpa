package web;
import java.sql.*;
import java.util.*;
import org.springframework.ui.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class Web {
	@RequestMapping("/")
	String home() {
		return "index";
	}

	@RequestMapping("/demo")
	String demo() {
		return "demo.jsp";
	}
	
	@Autowired
	private CoffeeRepository coffee;
	
	@RequestMapping("/list") @ResponseBody
	List list() {
		return coffee.list();
	}
}
