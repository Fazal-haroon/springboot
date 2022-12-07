package com.example.demo.controller;

import com.example.demo.entity.Books;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public String findAllBooks(Model model){
        List<Books> booksList = bookService.findAllBooks();
        model.addAttribute("books", booksList);
        return "books";
    }
}
