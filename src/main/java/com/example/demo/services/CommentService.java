package com.example.demo.services;

import com.example.demo.models.Comment;

import java.util.Set;

public interface CommentService {

    public Set<Comment> GetByItemID(Long itemID);

}
