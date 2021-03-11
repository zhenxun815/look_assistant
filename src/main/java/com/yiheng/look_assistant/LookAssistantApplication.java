package com.yiheng.look_assistant;

import com.yiheng.look_assistant.db.repository.BaseRepository;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Yiheng
 * @since 2021/3/5 下午10:56
 *
 */

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(repositoryBaseClass = BaseRepository.class)
public class LookAssistantApplication extends Application {

    public static void main(String[] args) {
        SpringApplication.run(LookAssistantApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
