package com.Shivam.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Shivam.Model.Book;

public interface BookRepo extends CrudRepository<Book, Long>{

}
