package com.vel.SpringWebAppDemo.bootstrap;


import com.vel.SpringWebAppDemo.domain.Author;
import com.vel.SpringWebAppDemo.domain.Book;
import com.vel.SpringWebAppDemo.domain.Publisher;
import com.vel.SpringWebAppDemo.repositories.AuthorRepository;
import com.vel.SpringWebAppDemo.repositories.BookRepository;
import com.vel.SpringWebAppDemo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234567890");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author vel=new Author("Vel","Murugan");
        Book dedup=new Book("Data Dedup","12345");

        vel.getBooks().add(dedup);
        dedup.getAuthors().add(vel);

        authorRepository.save(vel);
        bookRepository.save(dedup);

        System.out.println("Started in boot Strapping");
        System.out.println("Number of books"+bookRepository.count());


        Publisher TMH=new Publisher("Tata Magraw Hills","Saidapet","Chennai","TamilNadu","6000001");


        publisherRepository.save(TMH);
        System.out.println("Publisher added : " +TMH.toString());
        System.out.println("No of Publisher:"+publisherRepository.count());

    }
}
