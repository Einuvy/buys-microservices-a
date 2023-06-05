package com.einuvy.buy.DTO;

import com.einuvy.buy.models.Buy;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.einuvy.buy.models.Buy}
 */

@Getter
public class BuyDTO implements Serializable {
    private final Long id;
    private final Long userId;
    private final Long inmuebleId;
    private final String name;
    private final Double price;
    @JsonFormat(pattern = "dd/MM/yy - HH:mm:ss")
    private final LocalDateTime creationDate;

    public BuyDTO(Buy buy) {
        this.id = buy.getId();
        this.userId = buy.getUserId();
        this.inmuebleId = buy.getInmuebleId();
        this.name = buy.getName();
        this.price = buy.getPrice();
        this.creationDate = buy.getCreationDate();
    }
}