<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Print DB </title>
    <link rel="stylesheet" href="Genricstyle.css">
</head>
<body>
    <div class="maindiv">
        <h1 id="mainheading">Select the Database you want to View</h1>
        <form action="printdb" method="get">
           <input type="radio" name="DBtoprint" id="" value="STUDENT"> 
           <label for="">STUDENT</label>
           <input type="radio" name="DBtoprint" id="" value="FEES"> 
           <label for="">FEES</label>
           <input type="radio" name="DBtoprint" id="" value="TEACHER"> 
           <label for="">TEACHER</label>
           <input type="radio" name="DBtoprint" id="" value="GRADES"> 
           <label for="">GRADES</label>
           <br> <br>
           <button type="submit">View</button>
        </form>
       </div>
</body>
</html>