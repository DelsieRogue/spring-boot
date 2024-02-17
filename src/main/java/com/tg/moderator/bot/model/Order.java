package com.tg.moderator.bot.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private User buyer;

    private Boolean isActive;

    private Date beginDate;

    private Date endDate;

    private BigDecimal price;

    @OneToOne(mappedBy = "Order", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Subscribe subscribe;

}
