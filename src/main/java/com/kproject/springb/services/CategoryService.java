package com.kproject.springb.services;

import com.kproject.springb.entities.Category;
import com.kproject.springb.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository userRepository;

    public List<Category> findAll() {
        return userRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> obj = userRepository.findById(id);
        return obj.get();
    }
}
