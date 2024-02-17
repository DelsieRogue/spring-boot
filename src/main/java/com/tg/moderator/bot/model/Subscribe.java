package com.tg.moderator.bot.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
@Table(name = "subscribe")
public class Subscribe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;

    private Public public_;

    private Integer msgCounter;

    private List<Manager> managers;
}
