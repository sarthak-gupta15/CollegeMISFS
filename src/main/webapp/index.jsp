<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
 <div class="main" >
        <h1 id="main-heading" >Welcome to college Management Portal</h1>

        <div class="sub-main">
           <ul>
            <a href="StudentForm.jsp"><li>Create the record for the student</li></a>
            <a href="FeesForm.jsp"><li>Create fees record with Student Id</li></a>
            <a href="printdb.jsp"><li>Print Database</li></a>
            <a href="updateFees.jsp"><li>Update fees by student id</li></a>
            <a href="teacherForm.jsp"><li>Create teacher Record</li></a>
            <a href="gradesform.jsp"><li>Add Grades for student</li></a>
           </ul>
        </div>
    </div>

</body>
</html>