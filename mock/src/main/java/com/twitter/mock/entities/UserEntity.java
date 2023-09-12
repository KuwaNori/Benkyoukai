package com.twitter.mock.entities;

import lombok.Data;

import java.util.Date;
@Data
public class UserEntity {
    private String user_id;
    private String name;
    private Date birth_day;
    private String bio;
    private int following;
    private int follower;
    private String icon_dir;
    private boolean private_lock;

}
