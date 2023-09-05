package com.twitter.mock.bookmark.endpoints;

import com.twitter.mock.bookmark.services.BookmarkService;
import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookmarkEndpoint {
    BookmarkService service = new BookmarkService();

    @GetMapping("/bookmark")
    public Response getBookmark() {
        return service.getBookmark();
    }
}
