package com.endava.juniorprogram.profilesEndava.rest;

import com.endava.juniorprogram.profilesEndava.model.Profile;
import com.endava.juniorprogram.profilesEndava.services.IServicioProfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private IServicioProfiles servicioProfiles;

    @GetMapping
    public List<Profile> getProfiles(){
        return servicioProfiles.getAll();
    }

    @GetMapping("{id}")
    public Optional<Profile> getProfileByDev(@PathVariable("id") long id){
        return servicioProfiles.getByDev(id);
    }

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile){
        return servicioProfiles.addProfile(profile);
    }
}
