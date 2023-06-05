package com.einuvy.buy.repositories;

import com.einuvy.buy.models.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.NonNull;

import java.util.List;

@RepositoryRestResource
public interface BuyRepository extends JpaRepository<Buy, Long> {
    List<Buy> findALLByUserId(@NonNull Long userId);
}