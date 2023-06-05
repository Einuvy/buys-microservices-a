package com.einuvy.buy.services;

import com.einuvy.buy.DTO.BuyCreationDTO;
import com.einuvy.buy.DTO.BuyDTO;
import com.einuvy.buy.models.Buy;

import java.util.List;

public interface BuyService {


    BuyDTO saveBuy(BuyCreationDTO buyDTO);

    List<BuyDTO> findAllBuys(Long userId);
}
