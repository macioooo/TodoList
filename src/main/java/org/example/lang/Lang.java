package org.example.lang;

import jakarta.persistence.*;

@Entity
@Table(name = "LANGUAGES")
public class Lang {
    @Id
    private Integer id;
    private String welcomeMsg;
    private String code;

    public Lang(Integer id, String welcomeMsg, String code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    /**
     * Hibernate(JPA) needs it
     */

    @SuppressWarnings("unused")
    Lang() {

    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }
}
