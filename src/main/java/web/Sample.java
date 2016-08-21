package web;
import java.sql.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Sample {

@RequestMapping("/data") @ResponseBody
List data() {
	List list = new LinkedList<Coffee>();
	String sql = "select * from coffee";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url);
		PreparedStatement ps = cn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Coffee c = new Coffee();
			c.name   = rs.getString("name");
			c.price  = rs.getDouble("price");
			list.add(c);
		}
		rs.close();
		ps.close();
		cn.close();
	} catch (Exception e) { }
	return list;
}

String url = "jdbc:mysql://localhost/coffee_shop" +
	"?characterEncoding=UTF-8" +
	"&user=coffee&password=password";

}
