package com.kuharskiworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

public class Application extends SpringBootServletInitializer {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Application.class.getName());

    @Value("${profile:EMPTY}")
    String profile;

    @Value("${version:NOT_FOUND}")
    String version;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    Environment environment;

    @Value("${spring.profiles.active:Unknown}")
    private String activeProfile;

    public void getActiveProfiles() {
        for (final String profileName : environment.getActiveProfiles()) {
            LOGGER.info("Currently active profile - " + profileName);
        }
    }

    @PostConstruct
    public void audit() {
        getActiveProfiles();
    }

    @PostConstruct
    public void print() {
        this.getActiveProfiles();
        String p = activeProfile + " - profile:: " + profile;
        LOGGER.info("Profile:" + p);
        LOGGER.info("Version:" + version);
    }
}