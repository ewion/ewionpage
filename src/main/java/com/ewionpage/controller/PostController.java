package com.ewionpage.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ewionpage.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class PostController {
    // HTTP methods
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
    // 글 등록 : POST method

    @PostMapping("/posts")
    public String post(PostCreate params) {
        // log.info("title={}, content={}",title, content);
        log.info("params={}",params);
        return "Hello World!";

    }
}
