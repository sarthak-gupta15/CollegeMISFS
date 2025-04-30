<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title>Fees Form</title>
    <link rel="stylesheet" href="Genricstyle.css">
</head>
<body>
   <div class="maindiv">
    <h1 id="mainheading">Fees Form For Register Student</h1>
    <form action="feesrecord" method="post">
        <label for="">Student Id</label>
        <br>
        <input type="number" name="studentId" id="" placeholder="enter student Id">
        <br><br>
        <label for="">Total fees</label>
       <br> 
        <input type="number" name="totalFees" id="" placeholder="enter total fess">
       <br><br>
        <label for="">Paid Fees</label>
        <br>
        <input type="number" name="paidFees" id="" placeholder="enter paid fees">
   <br>
   <button type="submit">submit</button>
    </form>
   </div>
</body>
</html>