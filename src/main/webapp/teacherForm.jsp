<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
    <style>
        * {
            background-color: #e5e5ee;
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
        
        #Teacherform{
            border: 5px solid #14213d;
            margin-top: 25px;
            text-align: center;
            padding-bottom: 15px;
            margin-left: 250px;
            margin-right: 250px;
        }

       

        .submitButton {
            background-color:  rgba(5, 10432, 2, .55);;
            color: #ffffff;
            margin-right: 5px;
            padding: 5px;
            text-decoration: 0;
            border: 2px solid gray;
            border-radius: 20px;
            padding: 10px
        }
        
        .resetButton {
       background-color: #d62828;
            color: #ffffff;
        margin-right: 5px;
            padding: 5px;
            text-decoration: 0;
            border: 2px solid gray;
            border-radius: 20px;
            padding: 10px
        }

        .submitButton:hover {
            background-color: #14213d;
            color: #fca311;
        }
    </style>

</head>

<body>
    <div id="Teacherform">
        <h1 style="color: blue; text-align: center; font-webkit-text-stroke: 0.5px brown;">Teacher Registration Form</h1>
        <form action="teacher-form" method="post">
            <label for="NAME:">Name:</label>
            <input type="text" id="name" name="name" placeholder="EnterFull Name">
            <br><br>
            <label for="STATUS:">Branch:</label>
            <input type="text" name="branch" id="" placeholder="enter your branch">
            <br><br>
            <br>
            <label for="GENDER:">GENDER:</label>
            <input type="radio" name="gender" value="MALE" id="male">
            <label for="male">Male</label>
            <input type="radio" name="gender" value="FEMALE" id="female">
            <label for="female">Female</label>
            <input type="radio" name="gender" value="OTHER" id="other">
            <label for="other">Other</label>
            <br><br>
              <label for="EXPERIENCE:">EXPERIENCE:</label>
            <input type="number" id="EXPERIENCE" name="experience" placeholder="Enter Experience">
               <br><br>
            <label for="date">DATE OF JOINING:</label>
            <input type="date" id="date" name="joindate">
            <br><br>
            <button type="submit" class="submitButton">Submit</button>
            <button type="reset" class="resetButton">Reset</button>
            <br>
        </form>
    </div>
</body>

</html>