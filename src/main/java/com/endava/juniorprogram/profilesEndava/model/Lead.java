package com.endava.juniorprogram.profilesEndava.model;

import javax.persistence.Entity;

@Entity
public class Lead extends User{
    public Lead(long id, String mail, String password) {
        super(id, mail, password);
    }

    public Lead() {
        super();
    }
}
