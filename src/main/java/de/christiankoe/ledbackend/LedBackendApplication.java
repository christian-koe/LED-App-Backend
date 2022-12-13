package de.christiankoe.ledbackend;

import de.christiankoe.ledbackend.model.Profile;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class LedBackendApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LedBackendApplication.class, args);

        Profile profile = new Profile(true, 0, 0, new ArrayList<>());
        System.out.println(profile);
        profile.addColor(10);
        profile.addColor(20);
        profile.removeColor(10);
        profile.removeColor(4);
        System.out.println(profile);
    }

}
