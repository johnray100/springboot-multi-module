package jay.springbootlibrarycrudapps.Repository;

import jay.springbootlibrarycrudapps.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
