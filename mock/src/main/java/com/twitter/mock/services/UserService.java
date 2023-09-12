package com.twitter.mock.services;


import com.twitter.mock.entities.FollowEntity;
import com.twitter.mock.entities.UserEntity;
import com.twitter.mock.entities.UserRegisterEntity;
import com.twitter.mock.model.UserModel;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@Transactional
public class UserService {

    @Autowired
    UserModel userModel;
    public Response userRegister(UserRegisterEntity userRegisterEntity) throws SQLException {
        if (searchUser(userRegisterEntity.getUserId())) {
            return Response.status(409).build();
        }
        registerUser(userRegisterEntity);
        return Response.ok().build();
    }

    public Response userUpdate(UserEntity user) {
        userModel.updateUser(user);
        return Response.ok().build();
    }

    public Response updateFollow(FollowEntity followEntity) {
        userModel.updateFollow(followEntity);
        return Response.ok().build();
    }

    public boolean searchUser(String userId) {
        return userModel.findById(userId) != null;
    }

    public void registerUser(UserRegisterEntity userRegisterEntity) {
        userModel.registerUser(userRegisterEntity);
    }
}
