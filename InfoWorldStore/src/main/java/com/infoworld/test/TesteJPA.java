package com.infoworld.test;

import com.infoworld.model.Product;
import com.infoworld.util.JPAUtil;
import javax.persistence.EntityManager;

public class TesteJPA {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        // Criando um produto de teste
        em.getTransaction().begin();
        Product produto = new Product("Laptop", 2500.00, "Dell Inspiron 15");
        em.persist(produto);
        em.getTransaction().commit();

        System.out.println("Produto salvo com sucesso: " + produto);
        em.close();
    }
}
