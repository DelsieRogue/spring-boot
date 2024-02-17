package com.tg.moderator.bot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
@Data
@Entity
@Table(name = "public")
public class Public {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String messenger;

    private String name;

    private String ref;

    private Integer numberOfSub;

    private Integer numberOfViews;

    private BigDecimal advertisingPrice;

    private String contacts;
}
