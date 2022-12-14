package de.christiankoe.ledbackend.services;

import de.christiankoe.ledbackend.model.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProfileService {
    private final List<Profile> profiles;

    public ProfileService() {
        profiles = new ArrayList<>();

    }

    public Profile createProfile() {
        Profile profile = new Profile(UUID.randomUUID().toString(), true, 0, 0, new ArrayList<>());
        profiles.add(profile);
        return profile;


    }


    public Optional<Profile> getProfile(String id) {

        return profiles.parallelStream().filter(p -> p.getId().equals(id)).findFirst();


    }

    public Optional<Profile> deleteProfile(String id) {
        Optional<Profile> delProfile = getProfile(id);
        if (delProfile.isPresent()) {
            profiles.remove(delProfile.get());
        }

        return delProfile;

    }

    public Profile updateProfile() {
        final Profile profile = null;
        return profile;


    }


}

