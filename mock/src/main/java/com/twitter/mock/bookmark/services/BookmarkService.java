package com.twitter.mock.bookmark.services;

import javax.ws.rs.core.Response;
import java.util.ArrayList;

public class BookmarkService {
    public Response getBookmark() {
        var entries = new ArrayList<>();
        return Response.ok(entries).build();
    }

    public Response insertBookmark() {
        return Response.ok().build();
    }
}
