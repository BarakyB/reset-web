package com.dev.objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String token;

    @Transient
    private List<PostObject> posts;

    @Transient
    private List<TreatmentObject> treatments;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void addPost (String post) {
    }

    public List<PostObject> getPosts() {
        return posts;
    }

    public void setPosts(List<PostObject> posts) {
        this.posts = posts;
    }

    public void addTurn (String turn){}

    public List<TreatmentObject> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<TreatmentObject> treatments) {
        this.treatments = treatments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
