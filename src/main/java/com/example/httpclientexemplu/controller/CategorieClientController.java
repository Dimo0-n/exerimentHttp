package com.example.httpclientexemplu.controller;

import com.example.httpclientexemplu.entity.Category;
import com.example.httpclientexemplu.service.CategoryClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class CategorieClientController {

    @Autowired
    private CategoryClientService categoryClientService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryClientService.getAllCategories();
    }

    @PostMapping("/newCategory")
    public void newCategory(@RequestBody Category category) {
        categoryClientService.newCategory(category);
    }

}
