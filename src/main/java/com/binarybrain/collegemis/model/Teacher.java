package com.binarybrain.collegemis.model;

import com.binarybrain.collegemis.utils.Gender;

import java.time.LocalDate;

public class Teacher
{
    private String name;
    private Gender gender;

    private LocalDate dateOfJoining;
    private int experience;
    
    private String branch;

    public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }




    public Teacher( String name, Gender gender, LocalDate dateOfJoining, int experience, String branch) {
 
        this.name = name;
        this.gender = gender;
        this.dateOfJoining=dateOfJoining;
        this.branch = branch;
        this.experience = experience;
    }
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfJoining=" + dateOfJoining +
                ", experience=" + experience +
                 ", branch=" + branch +
                '}';
    }
}

