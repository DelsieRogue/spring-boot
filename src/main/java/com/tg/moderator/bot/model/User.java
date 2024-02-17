package com.tg.moderator.bot.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String firstName;

    private String lastName;

    private String url;

    @Enumerated(EnumType.STRING)
    private Role role;

    private Date registrationDate;

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private Set<Order> orders;
}
