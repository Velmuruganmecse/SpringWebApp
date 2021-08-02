package com.vel.SpringWebAppDemo.repositories;

import com.vel.SpringWebAppDemo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
