package com.Shivam.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shivam.Model.Book;
import com.Shivam.Service.BookService;

@RestController
@RequestMapping("/Book")
public class BookController1 {

	@Autowired
	private BookService bookService;

	@PostMapping
	public Boolean saveBook(@RequestBody Book book) {
		bookService.save(book);
		return true;
	}

	@GetMapping
	public List<Book> getAllBook() {
		return bookService.getAll();
	}

	@GetMapping("/id/{id}")
	public Optional<Book> getBookById(@PathVariable long id) {
		return Optional.ofNullable(bookService.getBookById(id).orElse(null));

	}

	@DeleteMapping("/id/{id}")
	public void deleteBookById(@PathVariable long id) {
		bookService.deleteBookById(id);

	}

	@PutMapping("/id/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {

		Book oldBook = bookService.getBookById(id).orElse(null);

		if (book != null) {
			oldBook.setBookName(book.getBookName() != null && !book.getBookName().equals("") ? book.getBookName()
					: oldBook.getBookName());
			oldBook.setSubject(book.getSubject() != null && !book.getSubject().equals("") ? book.getSubject()
					: oldBook.getSubject());
		}
		bookService.save(oldBook);
		return oldBook;
	}

}
