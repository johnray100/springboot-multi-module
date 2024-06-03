package jay.springbootlibrarycrudapps.Repository;

import jay.springbootlibrarycrudapps.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
