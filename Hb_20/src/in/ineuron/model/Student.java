package in.ineuron.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String saddress;
	private Integer sage;
	@Override
	public String toString() {
		return "Student [id=" + sid + ", name=" + sname + ", address=" + saddress + ", age=" + sage + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer id) {
		this.sid = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String name) {
		this.sname = name;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String address) {
		this.saddress = address;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer age) {
		this.sage = age;
	}
	
	
	
	

}
