package com.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping(value = "/logger/{id:[0-9]+}")
    public String config(@PathVariable("id") Long id) {
        logger.trace("trace id: " + id);
        logger.debug("debug id: " + id);
        logger.info("info id: " + id);
        logger.warn("warn id: " + id);
        logger.error("error id: " + id);
        return id.toString();
    }

}
