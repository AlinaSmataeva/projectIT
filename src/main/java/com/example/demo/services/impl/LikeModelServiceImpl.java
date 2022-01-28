package com.example.demo.services.impl;

import com.example.demo.models.LikeModel;
import com.example.demo.repo.LikeModelRepository;
import com.example.demo.services.LikeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LikeModelServiceImpl implements LikeModelService {
    @Autowired
    private LikeModelRepository likeModelRepository;

    @Override
    public LikeModel GetLikeIfLiked(Long userID, Long itemID) {
        return likeModelRepository.GetLikeIfLiked(userID,itemID);
    }

    @Override
    public Set<LikeModel> GetByItemID(Long itemID) {
        return likeModelRepository.GetByItemID(itemID);
    }
}
