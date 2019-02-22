package com.sen.hello.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName PrintCurrentTimeTask
 * @Description //TODO
 * @Author Flying fish
 * @Date 2019/2/22 09:36
 * @Version V1.0.0
 **/

@Component
public class PrintCurrentTimeTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void printCurrentTime(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
