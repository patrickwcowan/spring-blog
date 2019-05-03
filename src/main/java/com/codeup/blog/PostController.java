package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String showPosts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post("It's Thursday","This is the body of my Thursday Post!!!");
        Post post2 = new Post("Tomorrow's Friday!", "Friday is one of my favorite days' of the week!!!");

        posts.add(post1);
        posts.add(post2);

        model.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable long id, Model model) {
        Post post = new Post("1 Post","This is a post about showing only 1 post one a page");
        model.addAttribute("post",post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateFrom() {
        return "You're viewing your create form";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "You've Posted!";
    }




}
