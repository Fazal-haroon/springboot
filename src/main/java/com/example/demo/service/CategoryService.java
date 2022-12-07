package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id){
        Category categories = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        return categories;
    }

    public void createCategory(Category categories){
        categoryRepository.save(categories);
    }

    public void deleteCategory(Long id){
        Category categories = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not Found"));
        categoryRepository.deleteById(categories.getId());
    }

    public void updateCategory(Long id, Category categories) {
        Category publisher = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not Found"));
        if (publisher.getId() == id) {
            categoryRepository.save(categories);
        }
    }
}
