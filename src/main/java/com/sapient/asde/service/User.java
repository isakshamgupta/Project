package com.sapient.asde.service;

import javax.management.relation.Role;

public class User {
    private Integer userid;
    private String username;
    private String password;
    private String email;
    private Long mobile;
    private Role role;

    public User(){

    }

    public User(Integer userid, String username, String password, String email, Long mobile, Role role) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.role = role;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", role=" + role +
                '}';
    }
}
