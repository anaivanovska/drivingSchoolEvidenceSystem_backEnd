package mk.ukim.finki.drivingschoolevidencesystem.service;

import mk.ukim.finki.drivingschoolevidencesystem.domain.dto.CategoryDTO;

import java.util.List;

public interface InstructorCategoryService {
    CategoryDTO addNewCategory(long instructorId, String categoryName);
    List<CategoryDTO> addAllCategories(long instructorId, List<String> names);
    List<CategoryDTO> getAllCategoriesForInstructor(long instructorId);
}
