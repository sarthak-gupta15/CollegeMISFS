package com.binarybrain.main;

import java.io.IOException;
import java.io.PrintWriter;

import com.binarybrain.collegemis.controller.GradesController;
import com.binarybrain.collegemis.model.Grades;
import com.binarybrain.collegemis.utils.Exam_Type;
import com.binarybrain.collegemis.utils.Semester;
import com.binarybrain.collegemis.utils.Year;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/grades")
public class GradesForm extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int studentId = Integer.parseInt(req.getParameter("studentId"));
		Year year = Year.valueOf(req.getParameter("year"));
		Semester semester = Semester.valueOf(req.getParameter("semster"));
		Exam_Type exam_Type = Exam_Type.valueOf(req.getParameter("exam_Type"));
		int totalMarks = Integer.parseInt(req.getParameter("totalmarks"));
		int obtain = Integer.parseInt(req.getParameter("Obtained"));
		Grades grades = new Grades(studentId, studentId, year, semester, exam_Type, totalMarks, obtain);
		GradesController controller = new GradesController();
		controller.createGradeRecord(grades);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("Grades record added successfully");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.include(req, resp);
	}
	

}
