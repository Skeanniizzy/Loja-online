package com.infoworld.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity  // Define esta classe como uma entidade JPA
@Table(name = "products")  // Mapeia para a tabela 'products' no banco de dados
public class Product implements Serializable {
		
		private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento no banco
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(length = 255)
    private String description;

    // Construtor vazio necessário para JPA
    public Product() {}

    // Construtor com parâmetros
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Método toString para facilitar depuração
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
    }
}
