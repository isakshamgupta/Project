package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User(123, "Saksham",
                "qwerty", "saksham@gmail.com", 9908734723L, Role.values(Doctor));
    }

    @AfterEach
    void tearDown() {
        user = null;
    }

    @Test
    void getUserid() {
        assertEquals(123, user.getUserid());
    }

    @Test
    void setUserid() {
        user.setUserid(12345);
        assertEquals(12345, user.getUserid());
    }

    @Test
    void getUsername() {
        assertEquals("Saksham", user.getUsername());
    }

    @Test
    void setUsername() {
        user.setUsername("gupta");
        assertEquals("gupta", user.getUsername());
    }

    @Test
    void getPassword() {
        assertEquals("qwerty", user.getPassword());
    }

    @Test
    void setPassword() {
        user.setPassword("hello");
        assertEquals("hello", user.getPassword());
    }

    @Test
    void getEmail() {
        assertEquals("saksham@gmail.com", user.getEmail());
    }

    @Test
    void setEmail() {
        user.setEmail("hello@gmail.com");
        assertEquals("hello@gmail.com", user.getEmail());
    }

    @Test
    void getMobile() {
        assertEquals(9908734723L, user.getMobile());
    }

    @Test
    void setMobile() {
        user.setMobile(9905427097L);
        assertEquals(9905427097L, user.getMobile());
    }

    @Test
    void getRole() {
        assertEquals("PATIENT", user.getRole());
    }

    @Test
    void setRole() {
        user.setRole(Role.DOCTOR);
        assertEquals("DOCTOR", user.getRole());
    }
}