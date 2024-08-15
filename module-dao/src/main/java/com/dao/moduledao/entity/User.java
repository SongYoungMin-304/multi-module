package com.dao.moduledao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lego_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
