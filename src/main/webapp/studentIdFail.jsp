<%@page import="studentDto.StudentMarks"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="studentIdFail.css">
<title>All the best</title>
   
</head>
<body>
<%StudentMarks std=(StudentMarks)request.getAttribute("student"); %>
<nav class="total" style="border: 2px solid wheat;">
        <nav class="kseeb">
            <h1 id="kseebtext">Karnataka Secondary Education Examination Board</h1>
            <h4 id="sslc">SSLC Examination Result</h4>
        </nav>
        <nav id="name">
            <table id="a" style="border: 2px solid white;">
                <tr>
                    <td>Name</td>
                    <td><%=std.getStudent_name() %></td>
                </tr>
                <tr>
                    <td>USN</td>
                    <td><%=std.getUniversity_seat_number() %></td>
                </tr>
            </table>
        </nav>
        <nav>
            <table id="b">
                <tr style="background-color:whitesmoke;">
                    <th>Subject</th>
                    <th>Obtained Marks</th>   
                    <th>Total Marks</th>
                    <th>Grade</th>
                </tr>
                <tr>
                    <td style="text-align: left;">KANNADA</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getKannada() %></td>
                    <td style="text-align: right;padding-right: 10px">125</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradKannada() %></td>
                </tr>
                <tr>
                    <td style="text-align: left;">ENGLISH</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getEnglish() %></td>
                    <td style="text-align: right;padding-right: 10px">100</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradEnglish() %></td>
                </tr>
                <tr>
                    <td style="text-align: left;">HINDI</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getHindi() %></td>
                    <td style="text-align: right;padding-right: 10px">100</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradHindi()%></</td>
                </tr>
                <tr>
                    <td style="text-align: left;">MATHS</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getMaths() %></td>
                    <td style="text-align: right;padding-right: 10px">100</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradMath()%></td>
                </tr>
                <tr>
                    <td style="text-align: left;">SCIENCE</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getScience() %></td>
                    <td style="text-align: right;padding-right: 10px">100</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradScience() %></td>
                </tr>
                <tr>
                    <td style="text-align: left;">S SCIENCE</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getSocial_science()%></td>
                    <td style="text-align: right;padding-right: 10px">100</td>
                    <td style="text-align: right;padding-right: 10px"><%=std.getGradSocialScience() %></td>
                </tr>
                <tr>
                    <th colspan="3" style="text-align: left;padding-left: 30px;">Obtained Marks</th>
                    <th colspan="2" style="text-align: end;padding-right: 10px;"><%=std.getObtained_marks() %></th>
                </tr>
                <tr>
                    <th colspan="3" style="text-align: left;padding-left: 30px;">Total Marks</th>
                    <th colspan="2" style="text-align: end;padding-right: 10px;">625</th>
                </tr>
            </table>

        </nav>

        <nav id="name">
            <table id="a" style="border: 2px solid white;">
                <tr>
                    <td>Result</td>
                    <td><%=std.getResult() %></td>
                </tr>
                <tr>
                    <td>Percenatge</td>
                    <td><%=std.getPercentage() %></td>
                </tr>
            </table>
        </nav>
        <button style="margin: 15px;">Print</button>
    </nav>
</body>
</html>