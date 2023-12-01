package com.publisher.publisherproject.repository;

import com.publisher.publisherproject.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {

}
