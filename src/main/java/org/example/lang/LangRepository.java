package org.example.lang;

import jakarta.persistence.EntityManager;
import org.example.JpaManager;

import java.util.List;
import java.util.Optional;

public class LangRepository {

    List<Lang> findAll() {
        EntityManager entityManager = JpaManager.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            var result = entityManager.createQuery("from Lang", Lang.class).getResultList();
            entityManager.getTransaction().commit();
            return result;
        } finally {
            JpaManager.closeEntityManager(entityManager);
        }
    }

    void createNewLanguage(Integer id, String welcomeMsg, String code) {
        EntityManager entityManager = JpaManager.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(new Lang(id, welcomeMsg, code));
            entityManager.getTransaction().commit();
        } finally {
            JpaManager.closeEntityManager(entityManager);
        }
    }

    public Optional<Lang> findById(Integer id) {
        EntityManager entityManager = JpaManager.getEntityManager();
        try {
            Lang lang = entityManager.find(Lang.class, id);
            return Optional.ofNullable(lang);
        } finally {
            JpaManager.closeEntityManager(entityManager);
        }
    }
}