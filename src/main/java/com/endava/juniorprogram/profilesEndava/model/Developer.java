package com.endava.juniorprogram.profilesEndava.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Developer extends User{
    @OneToOne
    private Profile profile;

    public Developer(long id, String mail, String password) {
        super(id, mail, password);
    }

    public Developer() {

    }
}
