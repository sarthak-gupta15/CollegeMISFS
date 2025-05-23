package com.binarybrain.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.binarybrain.collegemis.controller.FeesController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update-fees")
public class UpdateFees extends HttpServlet{
	
	static String studentId;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FeesController controller = new FeesController();
		studentId = req.getParameter("studentId");
		ResultSet resultSet = controller.unpaidFees(studentId);
		PrintWriter out = resp.getWriter();
		 out.print("<div class=\"maindiv\">");
	        out.print("<h1 id=\"mainheading\">PAYMENT GATEWAY</h1>");
	        try {
				out.print("<h2>Unpaid fees is:"+resultSet.getString(1) +"</h2>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				out.print("<h2>Total fees is:"+resultSet.getString(2) +" </h2>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        out.print("<form action=\"update-fees\" method=\"post\">");
	           out.print(" <label >Amount to pay</label>");
	           out.print(" <br>");
	           try {
				out.print(" <input type=\"number\" name=\"feestopay\" min=\""+1+"\" max=\""+resultSet.getString(2)+"\">");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           out.print(" <br> <br> ");
	          out.print(" <button type=\"submit\">Pay Fees</button>");
	       out.print(" </form>");
	      out.print(" </div>");
	      RequestDispatcher dispatcher = req.getRequestDispatcher("/dailogbox.jsp");
			dispatcher.include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FeesController controller = new FeesController();
		int paidFees = Integer.parseInt(req.getParameter("feestopay"));
		controller.updateFeesByStudentId(Integer.parseInt(studentId), paidFees);
		PrintWriter out = resp.getWriter();
		out.print("<h1>FEES Payed</h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.include(req, resp);
	}
	
	

}
