package com.dvops.maven.eclipse;

import java.util.*;

public class UserCollection {

    private ArrayList<User> users = new ArrayList<>();

    public UserCollection() {
    }

    public List<User> getUser() {
        return users;
    }

    public void addUser(User userData) {
        users.add(userData);
    }

    public User getByName(String name){
        for (User u : users) {
            if(u.getName().equals(name)) return u;
       }
        return null;
    }

    public void updateUser(String name, String password, String email) {
        for (User u : users) {
            if(u.getName().equals(name)) {
                u.setPassword(password);
                u.setEmail(email);
                break;
            }
        }
    }

    public void deleteUser(String name) {
        for (User u : users) {
            if(u.getName().equals(name)) {
                users.remove(u);
                break;
            }
        }
    }
}