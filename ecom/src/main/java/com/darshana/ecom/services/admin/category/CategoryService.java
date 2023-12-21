package com.darshana.ecom.services.admin.category;

import com.darshana.ecom.dto.CategoryDto;
import com.darshana.ecom.entity.Category;

public interface CategoryService {

    Category createcategory(CategoryDto categoryDto);
}
