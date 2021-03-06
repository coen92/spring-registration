<%--
  Created by IntelliJ IDEA.
  User: Piotr Kapica
  Date: 31.03.2019
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- Bootstrat CSS --%>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css"
	      integrity="sha384-PDle/QlgIONtM1aqA2Qemk5gPOE7wFq8+Em+G/hmo5Iq0CCmYZLv3fVRDJ4MMwEA" crossorigin="anonymous">
	<title>Products</title>
</head>
<body>
	<div style="margin: 30px" class="dropdown">
		<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown"
		        aria-haspopup="true" aria-expanded="false">Category</button>
		<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<c:forEach var="category" items="${categories}">
				<a class="dropdown-item" href="${category}">${category}</a>
			</c:forEach>
		</div>
		<a href="?count=1">1</a>
		<a href="?count=2">2</a>
		<a href="?count=3">3</a>
	</div>
	<h1 style="margin: 30px">Category: ${product.category}</h1>
	<div style="margin: 30px">
		<ul class="list-group" style="width: 400px">
			<c:forEach var="product" items="${products}">
				<li class="list-group-item">${product.name}</li>
			</c:forEach>
		</ul>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	        crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	        crossorigin="anonymous"></script>
</body>
</html>
