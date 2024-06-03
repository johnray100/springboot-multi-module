package jay.springbootlibrarycrudapps.Repository;

import jay.springbootlibrarycrudapps.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
