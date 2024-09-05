package fr.eni.filsrouge;

import org.springframework.boot.SpringApplication;

public class TestFilsrougeApplication {

    public static void main(String[] args) {
        SpringApplication.from(FilsrougeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
