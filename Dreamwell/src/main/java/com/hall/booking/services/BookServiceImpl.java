package com.hall.booking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hall.booking.model.Book;
import com.hall.booking.repository.BookRepository;
 
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository employeeRepository;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
	employeeRepository.save(book);
		
	}
 
	 
}
