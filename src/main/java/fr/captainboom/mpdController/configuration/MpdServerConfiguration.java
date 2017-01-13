package fr.captainboom.mpdController.configuration;


import lombok.extern.slf4j.Slf4j;
import org.bff.javampd.server.MPD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MpdServerConfiguration {
    @Bean
    public MPD mpd() {
        log.info("Creating new mpd connection");
        return new MPD.Builder().build();
    }
}
