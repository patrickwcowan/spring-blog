package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String hello() {
        return "posts/welcome";
    }


    @GetMapping("/posts")
    public String showPosts(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable long id, Model model) {

        model.addAttribute("posts",postDao.findById(id));
        return "posts/show";
    }

    @GetMapping("/posts/delete/{id}")
    public String deleteForm(@PathVariable Long id) {
        postDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("/posts/edit/{id}")
    public String editForm(@PathVariable long id, Model model){
     Post post = postDao.findById(id);
     model.addAttribute("post", post);
     return "posts/edit";
    }

    @PostMapping("posts/edit/{id}")
    public String editPost(@ModelAttribute Post post,@PathVariable long id) {
        User user = userDao.findById(id);
        post.setUsers(user);
        postDao.save(post);
        return "redirect:/posts";
    }


    @GetMapping("/posts/create")
    public String showCreateFrom(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    ///Creating a POST, this is then redirected to post/index to show all posts after it has bas been created
    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        User user = userDao.findById(1);
        post.setUsers(user);
        postDao.save(post);
        return "redirect:/posts";
    }




}
