package com.vel.SpringWebAppDemo.repositories;

import com.vel.SpringWebAppDemo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
