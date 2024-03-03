package com.codeWithProjects.Ecomm.repository;


import com.codeWithProjects.Ecomm.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {

}
