package com.bookapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.controllers.Output.CategoryFindAllOutput;
import com.bookapp.controllers.Output.CategoryFindByIdOutput;
import com.bookapp.models.BookCategory;
import com.bookapp.services.CategoryService;
import com.bookapp.services.Interfaces.IBookService;
import com.bookapp.services.Interfaces.ICategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
//	@Autowired
//	private IBookService bookService;
//	
//	@GetMapping(value = "/categories")
//	public CategoryFindAllOutput showCategoryByName(@RequestParam(value = "name", required = false) String name) {
//		CategoryFindAllOutput result = new CategoryFindAllOutput();
//		if(name != null) {
//			result.setListResult(categoryService.findByNameContaining(name));
//		} else {
//			result.setListResult(categoryService.findAll());
//		}
//		return result;
//	}
	
	
	@GetMapping(value = "/categories/{categoryId}")
	public Optional<BookCategory> findById(@PathVariable("categoryId") int categoryId) {
		//includes books
		return categoryService.findById(categoryId);
	}
}
