package com.einuvy.buy.controllers;

import com.einuvy.buy.DTO.BuyCreationDTO;
import com.einuvy.buy.DTO.BuyDTO;
import com.einuvy.buy.models.Buy;
import com.einuvy.buy.services.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/buy")
public class BuyController {

    @Autowired
    BuyService buyService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAllBuysOfUser(@PathVariable Long id){
        return new ResponseEntity<>(buyService.findAllBuys(id), OK);
    }

    @PostMapping
    public ResponseEntity<?> saveBuy(@RequestBody BuyCreationDTO buyDTO){
        return new ResponseEntity<>(buyService.saveBuy(buyDTO), CREATED);
    }


}
