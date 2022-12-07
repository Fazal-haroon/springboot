package com.example.demo.service;

import com.example.demo.entity.Books;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> findAllBooks(){
        return bookRepository.findAll();
    }

    public Books findBookById(Long id){
        Books book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not Found"));
        return book;
    }

    public void createBook(Books book){
        bookRepository.save(book);
    }

    public void deleteBook(Long id){
        Books book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not Found"));
        bookRepository.deleteById(book.getId());
    }

    public void updateBook(Long id, Books books){
        Books book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not Found"));
        if(book.getId() == id){
            bookRepository.save(books);
        }
    }
}
