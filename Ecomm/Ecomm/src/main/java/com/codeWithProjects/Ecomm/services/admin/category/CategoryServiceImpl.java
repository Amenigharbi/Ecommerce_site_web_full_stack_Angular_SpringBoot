package com.codeWithProjects.Ecomm.services.admin.category;

import com.codeWithProjects.Ecomm.dto.CategoryDto;
import com.codeWithProjects.Ecomm.repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.codeWithProjects.Ecomm.entity.Category;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl  implements CategoryService {
    private final CategoryRepo  categoryRepo;

    public Category createcategory(CategoryDto categoryDto)
    {
        Category category=new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());
        return categoryRepo.save(category);
    }
}
