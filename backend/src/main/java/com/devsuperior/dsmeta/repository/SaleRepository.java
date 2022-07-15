package com.devsuperior.dsmeta.repository;

import com.devsuperior.dsmeta.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gerson
 */
public interface SaleRepository extends JpaRepository<Sales, Long> {
    
}
