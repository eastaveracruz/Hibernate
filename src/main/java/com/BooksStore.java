package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.Date;

public class BooksStore {
    public static void main(String[] args) {
        EntityManagerFactory bookStore = Persistence.createEntityManagerFactory("book");
        EntityManager entityManager = bookStore.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        entityManager.persist(new BooksEntity("hell323", timestamp, 123));
        transaction.commit();


//        transaction.begin();
//        BooksEntity booksEntity = entityManager.
//        transaction.commit();
        entityManager.close();
        bookStore.close();



    }
}
