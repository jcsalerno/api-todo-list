package settman.todoapi.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
}
