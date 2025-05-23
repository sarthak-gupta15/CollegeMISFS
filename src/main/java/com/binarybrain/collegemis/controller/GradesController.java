package com.binarybrain.collegemis.controller;

import com.binarybrain.collegemis.model.Grades;
import com.binarybrain.collegemis.utils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradesController extends Utils {

//    static StudentController studentController = new StudentController();
    public GradesController()
    {
        super(con);
        createGradesTable();
    }
    static Connection con = DBConnect.connectDB();
    static Scanner scNum = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
     static Grades grades = new Grades(1,1, Year.FIRST, Semester.SECOND, Exam_Type.REGULAR, 100, 75);

    public static Grades[] gradesArray =  { grades };

    public static ArrayList<Grades> gradesData = new ArrayList(Arrays.asList(gradesArray));

   public void createGradeRecord(Grades grades )
    {

        
        
        Year year =grades.getYear();
       
        Semester semester = grades.getSemester();
     
        Exam_Type examType = grades.getExamType();

        int totalMarks = grades.getTotalMarks();

        int obtainedMarks = grades.getObtainedMarks();

        try {

            PreparedStatement Query = con.prepareStatement ( "insert into grades (StudentId, examtype, yearStudying, semester, totalMarks, obtainMarks) values (?, ?, ?, ?, ?, ?)");
            Query.setInt(1, grades.getStudentId());
            Query.setString(2, examType.toString());
            Query.setString(3, year.toString());
            Query.setString(4, semester.toString());
            Query.setInt(5, totalMarks);
            Query.setFloat(6, obtainedMarks);

            if (Query.executeUpdate() > 0) {
                System.out.println("****Grades record created successfully**** ");
            } else {
                System.out.println("**** Grades record not created *****");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createGradesTable()
    {
        try {

            String Query = "Create table if not exists grades (id serial primary key, StudentId int, examtype varchar, yearStudying varchar, semester varchar, totalMarks int, obtainMarks float, foreign key(StudentId) references student(id))";
            PreparedStatement preparedStatement = con.prepareStatement(Query);
            preparedStatement.executeUpdate();
            System.out.println("Grades table created Succesfully");

        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
