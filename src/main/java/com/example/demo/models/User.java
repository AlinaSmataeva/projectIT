package com.example.demo.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String password;
    private String email;
    private boolean unblocked;

    @Transient
    private String passwordConfirm;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Collection> collections;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Comment> comments;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<LikeModel> likes;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUnblocked() {
        return unblocked;
    }

    public void setUnblocked(boolean unblocked) {
        this.unblocked = unblocked;
    }

    public Set<Collection> getCollections() {
        return collections;
    }

    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<LikeModel> getLikes() {
        return likes;
    }

    public void setLikes(Set<LikeModel> likes) {
        this.likes = likes;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.email = username;
    }

    @Override
    public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
