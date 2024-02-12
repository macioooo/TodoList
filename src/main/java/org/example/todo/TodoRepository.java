package org.example.todo;

import jakarta.persistence.EntityManager;
import org.example.JpaManager;

import java.util.List;

public class TodoRepository {
    List<Todo> findAll() {
        EntityManager manager = JpaManager.getEntityManager();
        try {
            manager.getTransaction().begin();
            var result = manager.createQuery("from Todo", Todo.class).getResultList();
            manager.getTransaction().commit();
            return result;
        } finally {
            JpaManager.closeEntityManager(manager);
        }
    }
    Todo toggleTodo(Integer id) {
        EntityManager manager = JpaManager.getEntityManager();
        try {
            manager.getTransaction().begin();
            Todo todo = manager.find(Todo.class, id);
            todo.setDone(!todo.isDone());
            manager.getTransaction().commit();
            return todo;
        } finally {
            JpaManager.closeEntityManager(manager);
        }
    }

    Todo addTodo(Todo newTodo) {
        EntityManager manager = JpaManager.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(newTodo);
            manager.getTransaction().commit();
            return newTodo;
        } finally {
            JpaManager.closeEntityManager(manager);
        }

    }
}
