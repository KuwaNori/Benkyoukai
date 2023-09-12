package com.twitter.mock.entities;

import lombok.Data;

@Data
public class UserRegisterEntity {
    private String user_id;
    private String name;
    private boolean private_lock;

    public String getUserId() {
        return user_id;
    }
}
