package com.codeup.blog.models;

import javax.persistence.*;


@Entity
@Table(name = "posts")
public class Post {
    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String body;

    @OneToOne
    private User users;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

//    public Post(String title, String body) {
//        this.title = title;
//        this.body = body;
//        this.users = getUsers();
//    }
}
