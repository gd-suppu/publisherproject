package com.publisher.publisherproject;

import com.publisher.publisherproject.model.Publisher;
import com.publisher.publisherproject.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PublisherRepository publisherRepository;
    public Bootstrap(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Creating a sample Publisher
        Publisher publisher = new Publisher();
        publisher.setName("ABC Publishers");
        publisher.setAddressLine1("123 Main St");
        publisher.setCity("Cityville");
        publisher.setState("CA");
        publisher.setZip("12345");

        // Saving the Publisher to the database
        publisherRepository.save(publisher);

        // Retrieving and printing the saved Publisher
        Publisher savedPublisher = publisherRepository.findById(publisher.getId()).orElse(null);
        System.out.println("Saved Publisher: " + savedPublisher);
    }
}
