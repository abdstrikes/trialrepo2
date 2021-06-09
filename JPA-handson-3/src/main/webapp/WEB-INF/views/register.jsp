<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Employee Account Details </title>
</head>
<body>
<h1>Update Account Details</h1>
<span>${message}</span>
</br>
<table>

<form:form action="update" modelAttribute="staff" method="post">
	<tr>
		<td>
		<form:label path="name">Name:</form:label>
		</td>
		<td>
		<form:input type="text" path = "name" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		 <form:label path="id">Employee Id:</form:label>
		</td>
		<td>
		 <form:input type="number" path="id" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		<form:label path="joiningDate">Joining Date:</form:label>
		</td>
		<td>
		 <form:input type="date" path="joiningDate" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		 <form:label path="email">Email:</form:label>
		</td>
		<td>
		<form:input type="email" path="email" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		<form:label path="salaryAccount.accountNo">Account No:</form:label>
		</td>
		<td>
		<form:input type="text" path="salaryAccount.accountNo" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		<form:label path="salaryAccount.ifscCode">IFSC Code:</form:label>
		</td>
		<td>
		<form:input type="text" path="salaryAccount.ifscCode" required="required" /><br/>
		</td>
	</tr>
	
	<tr>
		<td>
		
		</td>
		<td>
		<input type="submit" value="Update"/>
		</td>
	</tr>
  
</form:form>
</table>
</body>
</html>