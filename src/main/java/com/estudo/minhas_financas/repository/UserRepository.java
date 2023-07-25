package com.estudo.minhas_financas.repository;

import com.estudo.minhas_financas.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    @Query(value = "SELECT u FROM UserModel u\n" +
            "JOIN FETCH u.roles rl \n" +
            "WHERE u.username=?1")
    Optional<UserModel> findByUsername(String username);
}
