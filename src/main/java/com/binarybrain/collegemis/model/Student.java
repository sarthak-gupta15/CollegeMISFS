package com.binarybrain.collegemis.model;

import com.binarybrain.collegemis.utils.Gender;
import com.binarybrain.collegemis.utils.Status;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String name;
    private int rollNo;
    private String branch;
    private String mob;
    private Status status;
    private Gender gender;
    LocalDate dateOfAddmision;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfAddmision() {
        return dateOfAddmision;
    }

    public void setDateOfAddmision(LocalDate dateOfAddmision) {
        this.dateOfAddmision = dateOfAddmision;
    }

    public Student( String name, int rollNo, String branch, String mob, Status status, Gender gender, LocalDate dateOfAddmision) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.mob = mob;
        this.status = status;
        this.gender = gender;
        this.dateOfAddmision = dateOfAddmision;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", branch='" + branch + '\'' +
                ", mob=" + mob +
                ", status=" + status +
                ", gender=" + gender +
                ", dateOfAddmision=" + dateOfAddmision +
                '}';
    }

    //    public static void main(String[] args) throws ParseException {
//        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2014-02-16");
//        LocalDate date2 = LocalDate.now();
//        LocalDate date3 = LocalDate.of(2014, 02,16);
//        System.out.println("date "+date);
//        System.out.println("date "+date2);
//        System.out.println("date "+date3);
//    }
//    public Student ()
//    {
//
//    }
}
