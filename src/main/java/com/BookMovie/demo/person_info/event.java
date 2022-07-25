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
public class event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String location;
	private String Bokked_movie;
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Customer> customers;
	

	public event() {
		
	}

	public event(String location,String Bokked_movie) {
		super();
		this.location=location;
		this.Bokked_movie=Bokked_movie;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBokked_movie() {
		return Bokked_movie;
	}
	public void setBokked_movie(String bokked_movie) {
		Bokked_movie = bokked_movie;
	}
	
	
}
