package com.binarybrain.collegemis.controller;

import com.binarybrain.collegemis.model.Fees;
import com.binarybrain.collegemis.utils.DBConnect;
import com.binarybrain.collegemis.utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FeesController extends Utils {

    static Scanner scNum = new Scanner(System.in);
    static Connection con = DBConnect.connectDB();
public FeesController()
{
    super(con);
    createFeesTable();
}


    public void createFeesRecord(Fees fees)
    {
        int studentId = fees.getStudentId();
        int totalFees = fees.getTotalFees();
        int paidFees = fees.getPaidFees();
        int unPaidFees = fees.getUnPaidFees();
        
        String sql = "insert into fees(studentId , totalFees, unpaidFees, paidFees) values (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, totalFees);
            preparedStatement.setInt(3, unPaidFees);
            preparedStatement.setInt(4, paidFees);
            preparedStatement.executeUpdate();
            System.out.println("record inserted.......");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateFeesByStudentId(int studentId)
    {
        System.out.println("enter the amout you want to pay");
        int paidFees = scNum.nextInt();
       String sqlQuery = "update fees set paidFees = paidFees+ ? , unPaidFees = unPaidFees - ? where studentId = ?";

        try {
//            PreparedStatement preparedStatement = con.prepareStatement("update fees set paidFees = paidFees+ ? , unPaidFees = unPaidFees - ? where studentId = ?");
            PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,paidFees);
            preparedStatement.setInt(2,paidFees);
            preparedStatement.setInt(3,studentId);
            preparedStatement.executeUpdate();
            System.out.println("fees updated.....");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void createFeesTable()
    {
        String sql = "CREATE TABLE IF NOT EXISTS Fees (\n"
                + " id serial PRIMARY KEY,\n"
                + " studentId integer NOT NULL,\n"
                + " totalFees integer NOT NULL,\n"
                + " paidFees integer,\n"
                + " unPaidFees integer NOT NULL,\n"
                +"FOREIGN KEY (studentId) REFERENCES student(id)"
                + ");";
        try {
                PreparedStatement query = con.prepareStatement(sql);
                query.execute();
            System.out.println("Fees table created successfully....");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
