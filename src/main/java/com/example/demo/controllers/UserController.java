package com.example.demo.controllers;

import com.example.demo.models.Item;
import com.example.demo.repo.*;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private LikeModelService like_modelService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/mainPage")
    public String mainPage(Model model)
    {
        model.addAttribute("GetItems", itemService.CollectAll());
        model.addAttribute("GetCollections", collectionService.CollectAll());
        //получение id текущего пользователя
        //присваивание коллекций всем итемам
        return "mainPage";
    }


}

