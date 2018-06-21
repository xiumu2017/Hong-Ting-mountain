package com.paradise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUplaodController {
    private final static Logger logger = LoggerFactory.getLogger(FileUplaodController.class);

    @RequestMapping("/upload")
    public String index() {
        return "upload";
    }

}
