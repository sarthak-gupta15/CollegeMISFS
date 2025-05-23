package com.binarybrain.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;
import java.time.LocalDate;

import com.binarybrain.collegemis.controller.TeacherController;
import com.binarybrain.collegemis.model.Teacher;
import com.binarybrain.collegemis.utils.Gender;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/teacher-form")
public class TeacherForm extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String branch = req.getParameter("branch");
		Gender gender = Gender.valueOf(req.getParameter("gender"));
		int experience = Integer.parseInt(req.getParameter("experience"));
		LocalDate dateOfJoining = LocalDate.parse(req.getParameter("joindate"));
//		System.out.println("dfghj "+experience);
		Teacher teacher = new Teacher(name, gender, dateOfJoining, experience, branch);
		TeacherController controller = new TeacherController();
		controller.createTeacherRecord(teacher);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("teacher record added successfully");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.include(req, resp);
		
	}

	
	
}
