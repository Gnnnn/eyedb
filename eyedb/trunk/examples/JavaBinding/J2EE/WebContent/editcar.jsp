<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="eyedb" class="org.eyedb.example.EyeDBBean" scope="page">
	<jsp:setProperty name="eyedb" property="databaseName" value='<%= pageContext.getServletContext().getInitParameter("database") %>' />
	<jsp:setProperty name="eyedb" property="tcpPort" value='<%= pageContext.getServletContext().getInitParameter("tcpPort") %>' />
</jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Person</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<h1>Edit car</h1>

<c:set var="oid" value='${param["oid"]}' />
<c:set var="car" value="${eyedb.car[oid]}"/>

<form name="editCarForm" action="EditCarServlet" method="get">
<table border="0">
<tr>
<td>Model</td>
<td><input type="text" name="model" value="${car.model}"/></td>
</tr>
<tr>
<td>Number</td>
<td><input type="text" name="number" value="${car.number}"/></td>
</tr>
<tr>
<td>Owner</td>
<td>
<select name="owner">
<c:forEach var="person" items="${eyedb.persons}">
	<option value="${person.oid}" ${(car.owner.oid == person.oid) ? "selected=\"true\"": ""}>${person.firstname} ${person.lastname}</option>
</c:forEach>
</select>
</td>
</tr>
</table>
<input type="hidden" name="oid" value="${car.oid}"/>
<input type="submit" value="Ok"/>
</form>

</body>
</html>