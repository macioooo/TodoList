package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class JpaManager {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Maciej.sz");

    static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    static void closeEntityManager(EntityManager entityManager) {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }
}