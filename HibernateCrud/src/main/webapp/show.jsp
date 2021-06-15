<%@page import="com.bean.Student"%>
<%@page import="com.Dao.StudentDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">All Data</h2>
	<%
		List<Student> list = StudentDAO.getAllStudents();
	%>
	<table align="center" border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Password</th> 
			<th>Contact</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>

		</tr>
		<%
			for (Student s : list) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getSfname()%></td>
			<td><%=s.getSpass()%></td>
			<td><%=s.getScontact()%></td>
			<td><%=s.getSemail()%></td>
			<td><form action="ActoionController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"> <input
						type="submit" name="action" value="Edit">
				</form></td>
			<td><form action="ActoionController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"> <input
						type="submit" name="action" value="Delete">
				</form></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>