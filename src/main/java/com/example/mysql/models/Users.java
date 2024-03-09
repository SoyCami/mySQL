package com.example.mysql.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table(name="user")
@With
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDuser;
    private String name;
    // private String password;

}

