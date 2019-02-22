package com.sen.hello.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @EnableScheduling 开启任务调度的功能
 */

@EnableScheduling
@SpringBootApplication
public class HelloQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloQuartzApplication.class, args);
    }

}
