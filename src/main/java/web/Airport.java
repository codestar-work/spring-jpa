package web;
import javax.persistence.*;

@Entity @Table(name="airport")
public class Airport {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String code;
}
