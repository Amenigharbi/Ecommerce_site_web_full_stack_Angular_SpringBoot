package com.codeWithProjects.Ecomm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    @Lob
    private String description;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

}
