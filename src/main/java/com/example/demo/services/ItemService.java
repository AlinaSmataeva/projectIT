package com.example.demo.services;

import com.example.demo.models.Item;

import java.util.List;
import java.util.Set;

public interface ItemService {
    public Item CollectByID(Long ID);

    public Set<Item> CollectByCollectionID(Long iD);

    public Set<Item> CollectAll();
}
