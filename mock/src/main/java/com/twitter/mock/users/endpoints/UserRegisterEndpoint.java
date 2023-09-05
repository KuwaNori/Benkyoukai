package com.twitter.mock.users.endpoints;

import com.twitter.mock.users.entities.UserRegisterEntity;
import com.twitter.mock.users.services.UserRegisterService;
import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserRegisterEndpoint {

    UserRegisterService service = new UserRegisterService();

    @PostMapping("/user-register")
    public Response userRegister(@RequestBody UserRegisterEntity userRegisterEntity) {
        return service.userRegister();
    }
}
