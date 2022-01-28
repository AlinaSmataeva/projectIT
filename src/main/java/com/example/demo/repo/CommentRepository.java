package com.example.demo.repo;

import com.example.demo.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    @Query("SELECT c FROM Comment c where c.item.id=:itemId")
    Set<Comment> GetByItemID(@Param("itemId") Long itemID);

    //public void Delete(int commentID) => dBContent.Comment.Remove(dBContent.Comment.FirstOrDefault(u => u.ID == commentID))
}
