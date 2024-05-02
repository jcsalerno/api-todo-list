package settman.todoapi.controller;
import org.springframework.web.bind.annotation.*;
import settman.todoapi.entity.Todo;
import settman.todoapi.service.TodoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    Todo create(@RequestBody Todo todo) {
        logger.info("Recebido novo Todo: {}", todo);
        Todo newTodo = todoService.create(todo);
        logger.info("Novo Todo criado: {}", newTodo);
        return newTodo;
    }


    @GetMapping
    List<Todo> list() {
        return todoService.list();

    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);

    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }

}
