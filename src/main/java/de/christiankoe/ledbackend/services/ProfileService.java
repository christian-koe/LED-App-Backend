package de.christiankoe.ledbackend.services;

import de.christiankoe.ledbackend.model.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public Profile getProfile(String id) {
        return new Profile(id, "Test", "Test");
    }

    public void addProfile(Profile profile) {
    }
}
