package com.example.demo.service;

import com.example.demo.entity.Authors;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Authors> findAllAuthors(){
        return authorRepository.findAll();
    }

    public Authors findAuthorById(Long id){
        Authors author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not Found"));
        return author;
    }

    public void createAuthor(Authors authors){
        authorRepository.save(authors);
    }

    public void deleteAuthor(Long id){
        Authors authors = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author no found"));
        authorRepository.deleteById(authors.getId());
    }

    public void update(Long id, Authors authors){
        Authors author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author no found"));
        if(author.getId() == id){
            authorRepository.save(authors);
        }
    }
}
