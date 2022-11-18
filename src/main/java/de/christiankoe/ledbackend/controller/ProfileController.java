package de.christiankoe.ledbackend.controller;

import de.christiankoe.ledbackend.config.ControllerMappings;
import de.christiankoe.ledbackend.model.Profile;
import de.christiankoe.ledbackend.services.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(profileService.getProfile(id));
    }

    @PostMapping("/")
    public ResponseEntity<Profile> postProfile(@RequestBody Profile profile) {
        profileService.addProfile(profile);
        return ResponseEntity.ok().build();
    }

}
