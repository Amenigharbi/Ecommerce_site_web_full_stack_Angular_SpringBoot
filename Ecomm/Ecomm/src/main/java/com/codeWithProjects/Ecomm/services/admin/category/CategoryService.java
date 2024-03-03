package com.codeWithProjects.Ecomm.services.admin.category;

import com.codeWithProjects.Ecomm.dto.CategoryDto;
import com.codeWithProjects.Ecomm.entity.Category;

public interface CategoryService {
    Category createcategory(CategoryDto categoryDto);
}
