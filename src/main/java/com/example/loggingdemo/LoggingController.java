package com.example.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class LoggingController {
    Logger log = LoggerFactory.getLogger(LoggingController.class);
    @GetMapping
    public String index() {
        log.trace("A TRACE MESSAGE");
        log.debug("A DEBUG MESSAGE");
        log.info("A INFO MESSAGE");
        log.warn("A WARN MESSAGE");
        log.error("AN ERROR MESSAGE");
        return "Checkout logs in output";
    }
}
