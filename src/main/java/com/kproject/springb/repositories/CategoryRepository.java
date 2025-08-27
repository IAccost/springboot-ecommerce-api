package com.kproject.springb.repositories;

import com.kproject.springb.entities.Category;
import com.kproject.springb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
