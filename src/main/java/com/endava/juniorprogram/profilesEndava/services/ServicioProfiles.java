package com.endava.juniorprogram.profilesEndava.services;

import com.endava.juniorprogram.profilesEndava.model.Profile;
import com.endava.juniorprogram.profilesEndava.repositories.ProfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioProfiles implements IServicioProfiles{

    @Autowired
    private ProfilesRepository profilesRepository;

    @Override
    public List<Profile> getAll() {
        return (List<Profile>) profilesRepository.findAll();
    }

    @Override
    public Optional<Profile> getByDev(long id) {
        return profilesRepository.findById(id);
    }
}
