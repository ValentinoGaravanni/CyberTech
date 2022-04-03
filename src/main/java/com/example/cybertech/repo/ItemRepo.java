package com.example.cybertech.repo;

import com.example.cybertech.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepo extends JpaRepository<Item,Long> {
    Item findByName(String name);
}
