package com.example.demo.repository;

import com.example.demo.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publishers, Long> {
}
