package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sales;
import com.devsuperior.dsmeta.services.SaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gerson
 */

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;
    
    @GetMapping
    public List<Sales> findSales(){
        return service.findSales();
    }
    
}
