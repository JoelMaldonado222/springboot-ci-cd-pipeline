package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingDemoController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemoController.class);

    // Basic info log endpoint
    @GetMapping("/log-info")
    public String logInfo() {
        logger.info("INFO endpoint hit: Normal system operation.");
        return "Logging INFO: Check your Docker logs!";
    }

    // Warning + Error endpoint for demo
    @GetMapping("/log-error")
    public String logError() {
        logger.warn("WARN endpoint hit: Something unusual happened.");
        logger.error("ERROR endpoint hit: Simulated failure for demo purposes.");

        // Simulate an exception (shows stacktrace in logs)
        throw new RuntimeException("Simulated exception: final project logging demo.");
    }
}
