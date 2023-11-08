package massimomauro.S6L3SpringWebandData.repositories;

import massimomauro.S6L3SpringWebandData.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  BlogsRepository extends JpaRepository<Blog, Integer> {
    Optional<Blog> findByEmail(String ics);
}
