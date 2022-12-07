package com.example.demo.service;

import com.example.demo.entity.Publishers;
import com.example.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publishers> findAllPublishers(){
        return publisherRepository.findAll();
    }

    public Publishers findPublisherById(Long id){
        Publishers publishers = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        return publishers;
    }

    public void createPublisher(Publishers publishers){
        publisherRepository.save(publishers);
    }

    public void deletePublisher(Long id){
        Publishers publishers = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not Found"));
        publisherRepository.deleteById(publishers.getId());
    }

    public void updatePublisher(Long id, Publishers publishers) {
        Publishers publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not Found"));
        if (publisher.getId() == id) {
            publisherRepository.save(publishers);
        }
    }
}
