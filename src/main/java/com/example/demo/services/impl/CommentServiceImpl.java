package com.example.demo.services.impl;

import com.example.demo.models.Comment;
import com.example.demo.repo.CommentRepository;
import com.example.demo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Set<Comment> GetByItemID(Long itemID) {
        return commentRepository.GetByItemID(itemID);
    }

}
