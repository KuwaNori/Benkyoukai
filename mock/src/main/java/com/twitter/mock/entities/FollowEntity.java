package com.twitter.mock.entities;

import lombok.Data;

@Data
public class FollowEntity {
    private String user_id; 
    private int following;
    private int follower;
}
