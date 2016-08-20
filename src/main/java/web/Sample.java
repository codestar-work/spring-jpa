package web;
import java.sql.*;
import java.util.*;
import org.springframework.ui.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class Sample {

	@RequestMapping("/data") @ResponseBody
	List data() {
		List list = new LinkedList<Coffee>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn = DriverManager.getConnection(
				"jdbc:mysql://localhost/coffee_shop?characterEncoding=UTF-8" +
				"&user=coffee&password=password");
			PreparedStatement ps = cn.prepareStatement("select * from coffee");
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
}
