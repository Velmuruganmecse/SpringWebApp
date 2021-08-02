package com.vel.SpringWebAppDemo.repositories;

import com.vel.SpringWebAppDemo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
