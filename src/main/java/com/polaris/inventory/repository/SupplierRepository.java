package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
