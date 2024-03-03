package com.codeWithProjects.Ecomm.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne(fetch=FetchType.LAZY,optional = false)
    @JoinColumn(name="category_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;
}
