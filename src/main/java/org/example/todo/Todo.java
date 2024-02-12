package org.example.todo;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private boolean done;


    /**
     * Hibernate(JPA) needs it
     */
    @SuppressWarnings("unused")
    public Todo() {

    }


    //create getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


}


