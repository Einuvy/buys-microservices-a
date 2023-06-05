package com.einuvy.buy.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "compra")
@NoArgsConstructor
public class Buy {
    @Id @Getter
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(nullable = false) @Getter @Setter
    private Long userId;
    @Column(nullable = false) @Getter @Setter
    private Long inmuebleId;
    @Column(nullable = false) @Getter @Setter
    private String name;
    @Column(nullable = false) @Getter @Setter
    private Double price;
    @Column(nullable = false) @Getter @Setter
    private LocalDateTime creationDate;

    public Buy(Long userId, Long inmuebleId, String name, Double price) {
        this.userId = userId;
        this.inmuebleId = inmuebleId;
        this.name = name;
        this.price = price;
        this.creationDate = LocalDateTime.now();
    }
}
