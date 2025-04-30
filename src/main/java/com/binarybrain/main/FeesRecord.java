package com.binarybrain.main;

import java.io.IOException;
import java.io.PrintWriter;

import com.binarybrain.collegemis.controller.FeesController;
import com.binarybrain.collegemis.model.Fees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feesrecord")
public class FeesRecord extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentId = req.getParameter("studentId");
		String totalFees = req.getParameter("totalFees");
		String paidFees = req.getParameter("paidFees");
		System.out.println("fees record "+studentId+" "+totalFees+" "+paidFees);
		FeesController feesController = new FeesController();
		Fees fees = new Fees(Integer.parseInt(studentId), Integer.parseInt(totalFees), Integer.parseInt(paidFees),(Integer.parseInt(totalFees) -Integer.parseInt(paidFees)) );
		feesController.createFeesRecord(fees);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>FEES RECORD ADDED</h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.include(req, resp);
	}

	
}
