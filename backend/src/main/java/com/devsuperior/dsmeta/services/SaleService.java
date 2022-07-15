/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sales;
import com.devsuperior.dsmeta.repository.SaleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gerson
 */

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;
    
    public List<Sales> findSales(){
        return repository.findAll();
    }
    
}
