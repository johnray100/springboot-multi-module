package jay.springbootlibrarycrudapps.Repository;

import jay.springbootlibrarycrudapps.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
