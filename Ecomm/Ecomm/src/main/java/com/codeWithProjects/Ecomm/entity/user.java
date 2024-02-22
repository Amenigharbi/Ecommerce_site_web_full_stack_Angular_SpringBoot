package com.codeWithProjects.Ecomm.entity;
import com.codeWithProjects.Ecomm.enums.UserRole;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class user {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
    private String name;
    private UserRole role;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

}
