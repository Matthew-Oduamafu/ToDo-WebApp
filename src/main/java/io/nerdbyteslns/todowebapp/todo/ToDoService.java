package io.nerdbyteslns.todowebapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<>();

    static {
        todos.add(new ToDo(1, "in28minutes", "Learn Spring MVC", LocalDate.of(2024, 5, 17), false));
        todos.add(new ToDo(2, "in28minutes", "Learn Struts", LocalDate.of(2000, 12, 1), false));
        todos.add(new ToDo(3, "in28minutes", "Learn Hibernate",
                LocalDate.now().plusYears(-4).plusMonths(-5).plusDays(13), false));
    }

    public List<ToDo> retrieveTodos(String user) {
        List<ToDo> filteredTodos = new ArrayList<>();
        for (ToDo todo : todos) {
            if (todo.getUsername().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public List<ToDo> findByUserName(String username) {
        return todos.stream().filter(todo -> todo.getUsername().equals(username)).toList();
    }
}
