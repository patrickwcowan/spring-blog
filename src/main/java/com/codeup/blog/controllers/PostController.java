package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.PostRepository;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        User sessionUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User userDB = userDao.findOne(sessionUser.getId());
        post.setUsers(userDB);
        postDao.save(post);
        return "redirect:/posts";
    }


    @GetMapping("/posts/create")
    public String showCreateFrom(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }



    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        User sessionUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User userDB = userDao.findOne(sessionUser.getId());
        post.setUsers(userDB);
        postDao.save(post);
        return "redirect:/posts";
    }




}
