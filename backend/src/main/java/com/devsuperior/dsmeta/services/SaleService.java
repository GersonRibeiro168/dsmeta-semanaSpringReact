/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sales;
import com.devsuperior.dsmeta.repository.SaleRepository;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author gerson
 */

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;
    
    public Page<Sales> findSales(String minDate, String maxDate, Pageable pageable){
        
        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        
        LocalDate min = minDate.equals(" ") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals(" ") ? today : LocalDate.parse(maxDate);
        
        return repository.findSales(min, max, pageable);
    }
    
}
