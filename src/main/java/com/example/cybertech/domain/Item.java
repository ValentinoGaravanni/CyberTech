package com.example.cybertech.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "What do you want to sell?")
    @Length(max = 255, message = "Name too long (more than 255)")
    private String name;
    @NotBlank(message = "You are really generous.But still put the price!")
    private double price;
    @Length(max = 1024, message = "More than 2048 symbols")
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;
}
