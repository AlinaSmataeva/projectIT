package com.example.demo.services.impl;

import com.example.demo.models.Item;
import com.example.demo.repo.ItemRepository;
import com.example.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item CollectByID(Long ID) {
        return itemRepository.CollectByID(ID);
    }

    @Override
    public Set<Item> CollectAll() {
        return (Set<Item>) itemRepository.findAll();
    }
    @Override
    public Set<Item> CollectByCollectionID(Long iD) {
        return itemRepository.CollectByCollectionID(iD);
    }
}
