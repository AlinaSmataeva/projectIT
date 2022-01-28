package com.example.demo.services.impl;

import com.example.demo.models.Collection;
import com.example.demo.repo.CollectionRepository;
import com.example.demo.services.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionRepository collectionRepository;

    @Override
    public Set<Collection> CollectionsByUserID(Long uID) {
        return collectionRepository.CollectionsByUserID(uID);
    }

    @Override
    public Collection CollectByID(Long ID) {
        return collectionRepository.CollectByID(ID);
    }

    @Override
    public Set<Collection> CollectAll() {
        return (Set<Collection>) collectionRepository.findAll();
    }
}
