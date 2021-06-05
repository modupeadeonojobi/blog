package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private PostsService service;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return service.getPost();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/posts")
    public void addPosts(@RequestBody Post postElement) {
        service.addPost(postElement);
    }

    @PostMapping("/update-posts")
    public void updatePost(@RequestBody Post post) {
        service.updatePost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        service.deletePost(id);
    }


}
