package de.christiankoe.ledbackend.controller;

import de.christiankoe.ledbackend.config.ControllerMappings;
import de.christiankoe.ledbackend.model.Profile;
import de.christiankoe.ledbackend.services.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RestControllerAdvice
@RequestMapping(ControllerMappings.PROFILE)
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> getProfile(@PathVariable String id) {
        Optional<Profile> oProfile = profileService.getProfile(id);
        if (oProfile.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


        return ResponseEntity.ok(oProfile.get());
    }

    @PostMapping("/")
    public ResponseEntity<Profile> postProfile() {

        return ResponseEntity.ok(profileService.createProfile());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Profile> deleteProfile(@PathVariable String id) {
        Optional<Profile> oProfile = profileService.deleteProfile(id);
        if (oProfile.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(oProfile.get());


    }
}
