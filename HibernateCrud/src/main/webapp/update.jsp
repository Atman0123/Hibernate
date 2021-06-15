<%@page import="com.bean.Student"%>
<html>
<body>
<% Student s=(Student)request.getAttribute("stu"); %>
	<h2 align="center">Update Record</h2>
	<form action="ActoionController" method="post">
		<table align="center" border="1" >
			<tr>
				<td> First Name</td>
				<td> <input type="text" name="sfname" value="<%= s.getSfname()%>">
					<input type="hidden" name="id" value="<%=s.getId()%>">
					
				</td>
			</tr>
			<tr>
				<td> password</td>
				<td> <input type="password" name="spass" value="<%= s.getSpass()%>" ></td>
			</tr>
			<tr>
				<td> Contact</td>
				<td> <input type="text" name="scontact" value="<%= s.getScontact()%>"></td>
			</tr>
			<tr>
				<td> Email Id</td>
				<td> <input type="text" name="semail" value="<%= s.getSemail()%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"> <input type="submit" name="action" value="Update"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
