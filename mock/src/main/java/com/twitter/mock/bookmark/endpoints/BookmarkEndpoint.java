package com.twitter.mock.bookmark.endpoints;

import com.twitter.mock.bookmark.services.BookmarkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

@RestController
public class BookmarkEndpoint {
    @Inject
    BookmarkService service;

    @GetMapping("/bookmark")
    public Response getBookmark() {
        return service.getBookmark();
    }
}
