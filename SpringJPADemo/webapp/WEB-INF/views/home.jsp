<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hola como estas mi amigo
	<br>
	<spring:url var="add" value="/add"></spring:url>
	<spring:url var="delete" value="/delete"></spring:url>
	<form:form action="${add}" modelAttribute="employee"
		cssClass="col-lg-6 col-lg-offset-1 col-md-6 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-default">Name</span>
			</div>
			<form:input type="text" cssClass="form-control" path="name"
				placeholder="Employee Name" required="true" />
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-default">Id</span>
			</div>
			<form:input type="text" cssClass="form-control" path="id"
				placeholder="Employee Id" required="true" />
		</div>
		<button
			class="btn btn-lg btn-primary btn-block col-lg-2 col-lg-offset-2"
			type="submit">Add Employee</button>
	</form:form>
	<div id="table" style="margin: 5px">
		<table
			class="table table-striped col-lg-6 col-lg-offset-1 col-md-6 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<jstl:if test="${not empty empList}">
					<jstl:forEach var="emp" items="${empList }" varStatus="loop">
						<tr>
							<th scope="row">${loop.index}</th>
							<td>${emp.id}</td>
							<td>${emp.name}</td>
							<td><a href="${delete}?empId=${emp.id}" class="btn btn-danger" >Delete</a></td>
						</tr>
					</jstl:forEach>
				</jstl:if>
			</tbody>
		</table>
	</div>
</body>
</html>