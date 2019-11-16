package mk.ukim.finki.drivingschoolevidencesystem.repository;

import mk.ukim.finki.drivingschoolevidencesystem.domain.models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
    void deleteCategoryByName(String name);
    @Query(value = "select c from category c where c.name in :names")
    List<Category> findCategoriesByName(@Param("names") List<String> names);
}


