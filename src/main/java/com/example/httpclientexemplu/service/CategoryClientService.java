package com.example.httpclientexemplu.service;

import com.example.httpclientexemplu.entity.Category;

import java.util.List;

public interface CategoryClientService {

    List<Category> getAllCategories();

    Category newCategory(Category category);

}
