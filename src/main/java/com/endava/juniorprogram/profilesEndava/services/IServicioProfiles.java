package com.endava.juniorprogram.profilesEndava.services;

import com.endava.juniorprogram.profilesEndava.model.Profile;

import java.util.List;
import java.util.Optional;

public interface IServicioProfiles {
    List<Profile> getAll();
    Optional<Profile> getByDev(long id);
    Profile addProfile(Profile profile);
}
