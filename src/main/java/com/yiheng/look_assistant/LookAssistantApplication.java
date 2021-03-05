package com.yiheng.look_assistant;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yiheng
 * @since 2021/3/5 下午10:56
 *
 */

@SpringBootApplication
public class LookAssistantApplication extends Application {

    public static void main(String[] args) {
        SpringApplication.run(LookAssistantApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
