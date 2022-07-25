package com.BookMovie.demo.person_info;



import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Long phno;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="customers",cascade=CascadeType.ALL)
	 private List<event> bookedEvents;
	
	
	public Customer() {
	}
	public Customer(String email, String password, String firstName, String lastName, Long phno) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phno = phno;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public List<event> getBookedEvents() {
		return bookedEvents;
	}
	public void setBookedEvents(List<event> bookedEvents) {
		this.bookedEvents = bookedEvents;
	}

	

}
