package settman.todoapi.service;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import settman.todoapi.entity.Todo;
import settman.todoapi.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo create(Todo todo){
        return todoRepository.save(todo);
    }

    public List<Todo> list(){
        Sort sort = Sort.by("nome").ascending();
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
