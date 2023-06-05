package com.einuvy.buy.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.einuvy.buy.models.Buy}
 */
@NoArgsConstructor
@Getter
public class BuyCreationDTO implements Serializable {
    private Long userId;
    private Long inmuebleId;
    private String name;
    private Double price;
}