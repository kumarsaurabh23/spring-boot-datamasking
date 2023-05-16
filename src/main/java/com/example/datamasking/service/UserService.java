package com.example.datamasking.service;

import com.example.datamasking.dto.Account;
import com.example.datamasking.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(User.builder().id("u1").name("Peter").ssn("123456789").phone("1234567890").accounts(List.of(
                Account.builder().id("a1").number("888999777").build()
        )).build());
    }
}
