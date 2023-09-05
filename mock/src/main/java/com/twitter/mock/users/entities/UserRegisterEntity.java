package com.twitter.mock.users.entities;

public class UserRegisterEntity {
    private String userId;
    private String name;
    private boolean private_lock;

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public boolean isPrivate_lock() {
        return private_lock;
    }
}
