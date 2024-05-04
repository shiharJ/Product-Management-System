package com.SHDev.inventoryservice.repository;

import com.SHDev.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}

//Here's how it works:
//
//findBySkuCodeIn(List<String> skuCode): This method name implies that the framework should generate a query to find inventory items where the SKU code is in the provided list of SKU codes.
//The framework, assuming it's Spring Data JPA or a similar framework, interprets this method name and generates an appropriate SQL query behind the scenes. This query likely includes a WHERE clause with an IN operator to filter inventory items based on the provided SKU codes.
//When you call inventoryRepository.findBySkuCodeIn(skuCode), the generated SQL query is executed against the database, retrieving the inventory items that match the provided SKU codes.
