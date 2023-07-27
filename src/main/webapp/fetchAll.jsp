<%@page import="java.util.List"%>
<%@page import="studentDto.StudentMarks"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All the best</title>
</head>
<body>
		<%List<StudentMarks> std=(List<StudentMarks>)request.getAttribute("fetchall"); %>
		<table border="1px">
		<tr>
		<td>USN</td>
		<td>Name</td>
		<td>Kannada</td>
		<td>English</td>
		<td>Hindi</td>
		<td>Social Science</td>
		<td>Science</td>
		<td>Mathamatics</td>
		<td>Update</td>
		<td>Delete</td>
		</tr>
		<%for(StudentMarks s:std){ %>
		<tr>
		<td><%=s.getUniversity_seat_number() %></td>
		<td><%=s.getStudent_name() %></td>
		<td><%=s.getKannada() %></td>
		<td><%=s.getEnglish() %></td>
		<td><%=s.getHindi() %></td>
		<td><%=s.getSocial_science() %></td>
		<td><%=s.getScience() %></td>
		<td><%=s.getMaths() %></td>
		<td><button type="button" onclick="window.location.href='update.jsp?usn=<%=s.getUniversity_seat_number()%>&sname=<%=s.getStudent_name()%>&fname=<%=s.getFather_name()%>&date=<%=s.getDate_of_birth()%>&gender=<%=s.getGender()%>&kan=<%=s.getKannada() %>&eng=<%=s.getEnglish()%>&hind=<%=s.getHindi() %>&ss=<%=s.getSocial_science() %>&sci=<%=s.getScience() %>&math=<%=s.getMaths() %>';">Update</button></td>
		<td><button type="button" onclick="window.location.href='delete?usn=<%=s.getUniversity_seat_number()%>';">Delete</button></td>
		
		</tr>
		<%} %>
		</table>
</body>
</html>