package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostsService {
    @Autowired
    private PostsRepository repository;


    public List<Post> getPost() {
         return (List<Post>) repository.findAll();
    }

   public Post getById(Long id) {
        return repository.findById(id).get();
   }

    public void addPost(Post postElement) {
        repository.save(postElement);
    }

    public void updatePost(Post post) {
        repository.save(post);
    }

    public void deletePost(Long id) {
        repository.deleteById(id);
    }


}
