package org.example;

import jakarta.persistence.EntityManager;

import java.util.Optional;

public class LangRepository {
    private EntityManager entityManager = JpaManager.getEntityManager();

    void createNewLanguage(Integer id, String welcomeMsg, String code) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(new Lang(id, welcomeMsg, code));
            entityManager.getTransaction().commit();
        } finally {
            JpaManager.closeEntityManager(entityManager);
        }
    }

    Optional<Lang> findById(Integer id) {
        try {
            Lang lang = entityManager.find(Lang.class, id);
            return Optional.ofNullable(lang);
        } finally {
            JpaManager.closeEntityManager(entityManager);
        }
    }
}