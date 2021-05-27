package com.bookapp.services.Interfaces;

import java.util.List;

import com.bookapp.dto.BookCategoryDTO;
import com.bookapp.models.BookCategory;

public interface ICategoryService {
	
	List<BookCategoryDTO> findAll();
	List<BookCategoryDTO> findByNameContaining(String keyword);
	BookCategory findById(int categoryId);
}
