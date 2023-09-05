package com.twitter.mock.users.services;


import jakarta.ws.rs.core.Response;

import java.util.ArrayList;

public class UserRegisterService {

    public Response userRegister() {
        var entries = new ArrayList<>();
        return Response.ok(entries).build();
    }
}
