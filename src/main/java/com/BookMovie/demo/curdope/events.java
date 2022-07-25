package com.BookMovie.demo.curdope;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMovie.demo.person_info.event;

public interface events extends JpaRepository<event,Long> {

}
