package com.estudo.minhas_financas.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String username;

    @Column(name = "senha")
    private String password;

    @Column(name = "empresa_id")
    private Long companyId;

}
