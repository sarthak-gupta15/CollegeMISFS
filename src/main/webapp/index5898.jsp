<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOMEPAGE</title>
</head>
<body>
<% String name = "Rohit"; 
String name2 = "Pranay";
out.print(name56);
%>
<%! 
int add(int a , int b)
{
	return a+b;
	}
String name56 = "Harshit";
%>
<h1>Hello <% out.print(name); %> </h1>
<h1>Hello <%= name2 %> </h1>
<h1>Hello <%= name56 %> </h1>
</body>
</html>