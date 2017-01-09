package fr.captainboom.mpdController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Application root class used to bootstrap the application and its components.
 */
@SpringBootApplication
@EnableAsync
public class MpdControllerApplication {
    /**
     * Run this main when compiling the jar.
     *
     * @param args any customization welcome
     */
    public static void main(final String[] args) {
        SpringApplication.run(MpdControllerApplication.class, args);
    }
}
