package com.ecommerce.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}