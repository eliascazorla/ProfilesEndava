package com.endava.juniorprogram.profilesEndava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private int age;
    private long tenure;
    private String seniority;
    private String skills;
    private String historicalProjects;
    private long idDeveloper;

    public Profile(String fullName, int age, long tenure, String seniority, String skills, String historicalProjects, long idDeveloper) {
        this.fullName = fullName;
        this.age = age;
        this.tenure = tenure;
        this.seniority = seniority;
        this.skills = skills;
        this.historicalProjects = historicalProjects;
        this.idDeveloper = idDeveloper;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTenure() {
        return tenure;
    }

    public void setTenure(long tenure) {
        this.tenure = tenure;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getHistoricalProjects() {
        return historicalProjects;
    }

    public void setHistoricalProjects(String historicalProjects) {
        this.historicalProjects = historicalProjects;
    }

    public long getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(long idDeveloper) {
        this.idDeveloper = idDeveloper;
    }
}
