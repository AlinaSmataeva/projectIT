package com.example.demo.repo;

import com.example.demo.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ItemRepository extends JpaRepository<Item,Long> {

    @Query("SELECT c FROM Item c where c.id=:id")
    Item CollectByID(@Param("id") Long id);

    @Query("SELECT c FROM Item c where c.collection.id=:collectionId")
    Set<Item> CollectByCollectionID(@Param("collectionId") Long collectionId);
}