package com.einuvy.buy.services.implementation;

import com.einuvy.buy.DTO.BuyCreationDTO;
import com.einuvy.buy.DTO.BuyDTO;
import com.einuvy.buy.models.Buy;
import com.einuvy.buy.repositories.BuyRepository;
import com.einuvy.buy.services.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class BuyServiceImplementation implements BuyService {

    @Autowired
    BuyRepository buyRepository;

    @Override
    public BuyDTO saveBuy(BuyCreationDTO buyDTO){
        Buy buy = new Buy(buyDTO.getUserId(), buyDTO.getInmuebleId(), buyDTO.getName(), buyDTO.getPrice());
        return new BuyDTO(buyRepository.save(buy));
    }

    @Override
    public List<BuyDTO> findAllBuys(Long userId){
        return buyRepository.findALLByUserId(userId).stream().map(BuyDTO::new).collect(toList());
    }

}
