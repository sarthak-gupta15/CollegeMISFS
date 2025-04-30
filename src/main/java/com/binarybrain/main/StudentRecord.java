package com.binarybrain.main;

import java.io.IOException;
import java.time.LocalDate;

import com.binarybrain.collegemis.controller.StudentController;
import com.binarybrain.collegemis.model.Student;
import com.binarybrain.collegemis.utils.Gender;
import com.binarybrain.collegemis.utils.Status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentRecord extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String name = req.getParameter("name");
        String rollNo = req.getParameter("rollNo");
        String branch = req.getParameter("branch");
        String mobile = req.getParameter("mobile");
        String status = req.getParameter("status");
        String gender = req.getParameter("gender");
        String date = req.getParameter("dateOfAdmission");

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Mobile: " + mobile);
        System.out.println("Status: " + Status.valueOf(status));
        System.out.println("Gender: " + gender);
        System.out.println("Date of Admission: " + date);
        
        Student student = new Student(name, Integer.parseInt(rollNo), branch, mobile, Status.valueOf(status), Gender.valueOf(gender.toUpperCase()), LocalDate.parse(date));
        StudentController studentController = new StudentController();
        studentController.createStudentRecord(student);
        // Optionally forward to a success page or redirect
        resp.sendRedirect("index.jsp");
    }
}
