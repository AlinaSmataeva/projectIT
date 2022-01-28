package com.example.demo.repo;

import com.example.demo.models.LikeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LikeModelRepository extends JpaRepository<LikeModel,Long> {
    @Query ("SELECT l FROM LikeModel l where l.item.id=:itemId and l.user.id =:userId")
    LikeModel GetLikeIfLiked(Long userID, Long itemID);

    @Query("SELECT l FROM LikeModel l where l.item.id=:itemId")
    Set<LikeModel> GetByItemID(@Param("itemId") Long itemId);
}
