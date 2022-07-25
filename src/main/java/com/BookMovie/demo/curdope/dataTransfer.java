package com.BookMovie.demo.curdope;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMovie.demo.person_info.Customer;

public interface dataTransfer extends JpaRepository<Customer,Integer> {
	Boolean existsByemail(String Email);
	Customer findByemail(String Email);
}
