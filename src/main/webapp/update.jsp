<%@page import="studentDto.StudentMarks"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Marks</title>
<link rel="stylesheet" href="update.css">
</head>
<body>
  <nav class="kseeb">
            <h1 id="kseebtext">Karnataka Secondary Education Examination Board</h1>
            <h4 id="sslc">SSLC Examination Result</h4>
   </nav>
    <nav class="text">
<form action="Update" class="form">
<table>
<tr>
<td>USN_No</td>
<td>: <input type="number" name="usn"></td>
</tr>

<tr>
<td>Kannada</td>
<td>: <input type="number" name="kan"></td>
</tr>
<tr>
<td>English</td>
<td>: <input type="number" name="eng"></td>
</tr>
<tr>
<td>Hindi</td>
<td>: <input type="number" name="hind"></td>
</tr>
<tr>
<td>Social Science</td>
<td>: <input type="number" name="ss"></td>
</tr>
<tr>
<td>Maths</td>
<td>: <input type="number" name="math"></td>
</tr>
<tr>
<td>Science</td>
<td>: <input type="number" name="sci"></td>
</tr>

</table>
<h3 style="text-align: center;"><button >Submite</button></h3>

</form>
</nav>
<nav class="mar">
<marquee><h3>SSLC Result Declare on 25/05/2023 Website : http//karresult.com</h3></marquee>
</nav>
</body>
</html>