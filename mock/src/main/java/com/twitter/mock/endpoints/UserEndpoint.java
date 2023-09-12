package com.twitter.mock.endpoints;

import com.twitter.mock.entities.FollowEntity;
import com.twitter.mock.entities.UserRegisterEntity;
import com.twitter.mock.entities.UserEntity;
import com.twitter.mock.services.UserService;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController
public class UserEndpoint {

    @Autowired
    UserService service;

    @PostMapping("/user-register")
    public Response userRegister(@RequestBody UserRegisterEntity userRegisterEntity) throws SQLException {
        return service.userRegister(userRegisterEntity);
    }

    @PostMapping("/user-update")
    public Response updateUserInformation(@RequestBody UserEntity user) throws SQLException {
        return service.userUpdate(user);
    }

    @PostMapping("/follow-update")
    public Response updateFollow(@RequestBody FollowEntity follow) throws  SQLException {
        return service.updateFollow(follow);
    }
}
