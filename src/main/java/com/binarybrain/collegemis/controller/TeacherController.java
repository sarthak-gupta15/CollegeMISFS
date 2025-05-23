package com.binarybrain.collegemis.controller;
import com.binarybrain.collegemis.model.Teacher;
import com.binarybrain.collegemis.utils.DBConnect;
import com.binarybrain.collegemis.utils.Gender;
import com.binarybrain.collegemis.utils.Utils;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class TeacherController extends Utils
{
    Scanner scStr = new Scanner(System.in);
    Scanner scNum = new Scanner(System.in);
    static Connection con =DBConnect.connectDB();

    public TeacherController() {
        super(con);
        createTeacherTable(con);
    }

    public void createTeacherRecord(Teacher teacher) {
        String name = teacher.getName();

        
        Gender gender= teacher.getGender();
        LocalDate dateOfJoining = teacher.getDateOfJoining();

        
        int experience = teacher.getExperience();
        String branch = teacher.getBranch();

        try {
            PreparedStatement query = con.prepareStatement(
                    "insert into teacher (name, gender, date_of_joining, experience, branch) VALUES (?, ?, ?, ?,?)");
            query.setString(1, name);
            query.setString(2, gender.toString());
            query.setDate(3, java.sql.Date.valueOf(dateOfJoining));
            query.setInt(4, experience);
            query.setString(5, branch);

            if (query.executeUpdate() > 0) {
                System.out.println("Teacher record created successfully**** ");
            } else {
                System.out.println("**** Teacher record not created *****");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTeacherTable(Connection con) {
        try {
            Statement query = con.createStatement();
            String createTeacherTableQuery = ("CREATE TABLE IF NOT EXISTS teacher (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR, " +
                    "gender VARCHAR, " +
                    "date_of_joining DATE, " +
                    "experience INT," +
                    "branch varchar )");

            query.execute(createTeacherTableQuery);
            System.out.println("Teacher table created successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}