package com.Shivam.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shivam.Model.Book;
import com.Shivam.Repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public void save(Book book) {
		bookRepo.save(book);
	}

	public List<Book> getAll() {
		return (List<Book>) bookRepo.findAll();
	}

	public Optional<Book> getBookById(long id) {
		
		Optional<Book> book= bookRepo.findById(id);
	
	  return book;
	}

	public void deleteBookById(long id) {
		bookRepo.deleteById(id);
		System.out.println("Record Deleted");
	}

}
