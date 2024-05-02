# Todo API

Esta é uma aplicação de backend simples para uma API de gerenciamento de tarefas (todo). Ela foi desenvolvida usando Spring Boot e Java.

## Como usar

1. Clone este repositório em sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/todo-api.git
   
Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, etc.). Certifique-se de que você tenha um servidor MySQL configurado localmente e crie um banco de dados chamado todolist. Configure as credenciais do banco de dados no arquivo `application.properties` conforme necessário:

Execute a aplicação. Ela estará disponível em [http://localhost:8080](http://localhost:8080).

## Endpoints

A API possui os seguintes endpoints:

- POST /todos: Cria uma nova tarefa.
- GET /todos: Lista todas as tarefas.
- PUT /todos: Atualiza uma tarefa existente.
- DELETE /todos/{id}: Remove uma tarefa pelo seu ID.

### Testando os Endpoints

Você pode testar os endpoints utilizando ferramentas como o Postman para realizar as requisições para o backend.

## Estrutura do projeto

O projeto está organizado da seguinte forma:

- `controller/TodoController.java`: Controlador que define os endpoints da API.
- `entity/Todo.java`: Entidade que representa uma tarefa.
- `repository/TodoRepository.java`: Interface para acesso ao banco de dados.
- `service/TodoService.java`: Serviço responsável pela lógica de negócio relacionada às tarefas.
- `service/CorsConfiguration.java`: Configuração para permitir requisições de origens diferentes (CORS).
- `TodoApiApplication.java`: Classe principal que inicia a aplicação Spring Boot.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Postman
