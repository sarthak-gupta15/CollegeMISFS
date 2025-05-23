<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Grades form</title>
    <link rel="stylesheet" href="Genricstyle.css">
</head>

<body>
    <div class="maindiv">
        <h1 id="mainheading">Grades portal</h1>
        <form action="grades" method="post">
            <label for="">Student id</label>
            <br>

            <input type="number" name="studentId">
            <br> <br>
            <label for="">Year of Studying</label>
            <br><br>
            <input name="year" type="radio" value="FIRST">
            <label for="">FIRST</label>
            <input name="year" type="radio" value="SECOND">
            <label for="">SECOND</label>
            <input name="year" type="radio" value="THIRD">
            <label for="">THIRD</label>
            <input name="year" type="radio" value="FOURTH">
            <label for="">FOURTH</label>
            <br> <br>

            <label for="">Semster</label>
            <br><br>
            <input name="semster" type="radio" value="FIRST">
            <label for="">FIRST</label>
            <input name="semster" type="radio" value="SECOND">
            <label for="">SECOND</label>
            <input name="semster" type="radio" value="THIRD">
            <label for="">THIRD</label>
            <input name="semster" type="radio" value="FOURTH">
            <label for="">FOURTH</label>
            <br> <br>
            <input name="semster" type="radio" value="FIFTH">
            <label for="">FIFTH</label>
            <input name="semster" type="radio" value="SIXTH">
            <label for="">SIXTH</label>
            <input name="semster" type="radio" value="SEVENTH">
            <label for="">SEVENTH</label>
            <input name="semster" type="radio" value="EIGHTH">
            <label for="">EIGHTH</label>

            <br> <br>
            <label for="">Exam type</label>
            <br><br>
            <input name="exam_Type" type="radio" value="REGULAR">
            <label for="">REGULAR</label>
            <input name="exam_Type" type="radio" value="MAKEUP">
            <label for="">MAKEUP</label>
            <input name="exam_Type" type="radio" value="BACK">
            <label for="">BACK</label>
            <br> <br>
            <label for="">Total marks</label>
            <br>
            <input type="number" name="totalmarks">
            <br> <br>
            <label for="">Obtained marks</label>
            <br>
            <input type="number" name="Obtained">

            <br> <br>
            <button type="submit">Submit</button>
        </form>
    </div>

</body>

</html>