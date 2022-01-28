package com.example.demo.services;

import com.example.demo.models.LikeModel;
import com.example.demo.repo.LikeModelRepository;

import java.util.Set;

public interface LikeModelService {
    public LikeModel GetLikeIfLiked(Long userID, Long itemID);

    public Set<LikeModel> GetByItemID(Long itemID);
}
