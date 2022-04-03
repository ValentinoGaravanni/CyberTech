package com.example.cybertech.repo;

import com.example.cybertech.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
