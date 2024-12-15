package org.example.spring_zzp.service;

import org.example.spring_zzp.model.Category;
import org.example.spring_zzp.model.Task;
import org.example.spring_zzp.model.UserEntity;
import org.example.spring_zzp.repository.CategoryRepository;
import org.example.spring_zzp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;


    public List<Category> getCategories(Long userId){
        return categoryRepository.getUsersCategories(userId);
    }

    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    public Category getCategoryByName(String name, Long userId) {
        return categoryRepository.getCategoriesByName(name, userId);
    }

    public void addCategoryForUser(Category category, String username) {

        UserEntity user = userRepository.findByUsername(username).orElseThrow();
        category.setOwner(user);

        categoryRepository.save(category);
    }

    public void updateCategory(Long id, Category category) {
        Category categoryFromDB = categoryRepository.findById(id).orElseThrow();

        categoryFromDB.setName(category.getName());
        categoryFromDB.setDescription(category.getDescription());

        categoryRepository.save(categoryFromDB);
    }

    public void delete(Category category) {
        categoryRepository.delete(category);
    }

}
