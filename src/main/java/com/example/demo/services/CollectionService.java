package com.example.demo.services;

import com.example.demo.models.Collection;

import java.util.Set;

public interface CollectionService {

    public Set<Collection> CollectionsByUserID(Long uID);
    public Collection CollectByID(Long ID);
    public Set<Collection> CollectAll();
}
