package com.estudo.minhas_financas.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "roles")
@Data
public class Role implements GrantedAuthority, Serializable {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
