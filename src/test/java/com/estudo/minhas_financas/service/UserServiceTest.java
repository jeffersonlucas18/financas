package com.estudo.minhas_financas.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UserServiceTest {

    @Test
    public void test() {
        log.info("{}", new BCryptPasswordEncoder().encode("conquista"));
    }
}