package com.example.demo;

import com.example.demo.entity.Authors;
import com.example.demo.entity.Books;
import com.example.demo.entity.Category;
import com.example.demo.entity.Publishers;
import com.example.demo.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args -> {
            Books books = new Books("ABC", "Book name", "My First Book");
            Authors author = new Authors("Test name1", "Test description");
            Category category = new Category("business book");
            Publishers publishers = new Publishers("First Publisher");
            books.addAuthors(author);
            books.addCategory(category);
            books.addPublisher(publishers);
            bookService.createBook(books);

            Books books1 = new Books("ABC1", "Book name1", "My First Book1");
            Authors author1 = new Authors("Test name11", "Test description1");
            Category category1 = new Category("business book1");
            Publishers publishers1 = new Publishers("First Publisher1");
            books1.addAuthors(author1);
            books1.addCategory(category1);
            books1.addPublisher(publishers1);
            bookService.createBook(books1);
        });
    }

}
