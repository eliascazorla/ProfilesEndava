package com.endava.juniorprogram.profilesEndava.repositories;

import com.endava.juniorprogram.profilesEndava.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilesRepository extends CrudRepository<Profile, Long> {
}
