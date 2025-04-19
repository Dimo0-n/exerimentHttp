package com.example.httpclientexemplu.service;

import com.example.httpclientexemplu.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategorieClientServiceImpl implements CategoryClientService{

    @Value("${remote.server.url}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Category> getAllCategories() {
        return restTemplate.getForObject(serverUrl + "/categories", List.class);
    }

    @Override
    public Category newCategory(Category category) {
        Category category1 = new Category();
        category1.setName(category.getName());
        category1.setDescription(category.getDescription());
        return restTemplate.postForObject(serverUrl + "/categories/newCategory", category1, Category.class);
    }
}
