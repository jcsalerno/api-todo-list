package settman.todoapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import settman.todoapi.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
