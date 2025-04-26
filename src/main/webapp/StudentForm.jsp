<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
    <style>
        *{
            background-color: #e5e5e5;
        }

        label {
            text-decoration: 0;
            color: #14213d;
            padding-right: 10px;
        }
        input {
            border: 1px solid black;
            border-radius: 5px;

        }
        #studentform{
            border: 5px solid #14213d;
            margin-top: 25px;
            text-align: center;
            padding-bottom: 15px;
            margin-left: 250px;
            margin-right: 250px;
        }
        .submitButton{
            background-color: black;
            color: #e5e5e5;
            margin-right: 5px;
            padding: 5px;
            text-decoration: 0;
            border: 2px solid gray;
            border-radius: 20px;
            padding: 10px
        }
        .submitButton:hover{
            background-color: #14213d;
            color: #fca311;
        }
    </style>

</head>

<body>
    <a href="/CollegeMIS/"><button>back</button></a>
    <div id = "studentform">
       <h1 style="color: #fca311; text-align: center; font-webkit-text-stroke: 0.5px brown;" >Student Registration Form</h1>
    <form action="addRecords" method="post">
        <label for="NAME:">Name:</label>
        <input type="text"  name="name" placeholder="Enter Full Name">
        <br><br>
        <label for="ROLL NO:">ROLL NO:</label>
        <input type="number" id="number" name="namefield" placeholder="Enter Roll No">
        <br><br>
        <label for="BRANCH:">BRANCH:</label>
        <input type="text" id="name" name="namefield" placeholder="Enter
Branch">
        <br><br>
        <label for="MOBILE NO:">MOBILE NO:</label>
        <input type="number" id="number" name="namefield" placeholder="Enter MO No">
        <br><br>
        <label for="STATUS:">STATUS:</label>
        <select name="STATUS" id="STATUS">
            <option value="ACTIVE">ACTIVE</option>
            <option value="INACTIVE">INACTIVE</option>
            <option value="COMPLETEDE">COMPLETED</option>
        </select>
        <br><br>
        <br>
        <label for="GENDER:">GENDER:</label>
        <input type="radio" name="gender" value="male" id="male">
        <label for="male">Male</label>
        <input type="radio" name="gender" value="female" id="female">
        <label for="female">Female</label>
        <input type="radio" name="gender" value="other" id="other">
        <label for="other">Other</label>
        <br><br>
        <label for="date">DATE OF ADDMITION:</label>
        <input type="date" id="date" name="date">
        <br><br>
        <button type="submit" class="submitButton">Submit</button>
        <button type="reset" class="submitButton">Reset</button>
        <br>
    </form>
   </div>
</body>

</html>