package com.hall.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hall.booking.model.Book;

 
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
