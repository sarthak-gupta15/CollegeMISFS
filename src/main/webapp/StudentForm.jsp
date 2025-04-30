<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <a href="index.jsp"><button>Back</button></a>
    <div id="studentform">
        <h1>Student Registration Form</h1>
        <form action="student" method="post">
            <label>Name:</label>
            <input type="text" name="name" placeholder="Enter Full Name"><br><br>

            <label>Roll No:</label>
            <input type="number" name="rollNo" placeholder="Enter Roll No"><br><br>

            <label>Branch:</label>
            <input type="text" name="branch" placeholder="Enter Branch"><br><br>

            <label>Mobile No:</label>
            <input type="number" name="mobile" placeholder="Enter Mobile No"><br><br>

            <label>Status:</label>
            <select name="status">
                <option value="ACTIVE">ACTIVE</option>
                <option value="INACTIVE">INACTIVE</option>
                <option value="COMPLETED">COMPLETED</option>
            </select><br><br>

            <label>Gender:</label>
            <input type="radio" name="gender" value="male"> Male
            <input type="radio" name="gender" value="female"> Female
            <input type="radio" name="gender" value="other"> Other<br><br>

            <label>Date of Admission:</label>
            <input type="date" name="dateOfAdmission"><br><br>

            <button type="submit" class="submitButton">Submit</button>
            <button type="reset" class="submitButton">Reset</button>
        </form>
    </div>
</body>
</html>
