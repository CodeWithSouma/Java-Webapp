<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
<style>
     <%@ include file="css/dashboard-style.css"%>
</style>
<title>Welcome!!!</title>
</head>
<body>
	
	 <div class="container-fluid h-100 m-container">
		  <div class="mx-auto text-center p-3" style="width:70%">
		   		<h1 id="message" class="">🌼<u>Welcome ${name }</u>🌼</h1>
		   		<h1 id="todo" class=""> 💛 <u>Todo List</u> 💛</h1>
		  </div>
		
		<div class="d-flex justify-content-center mt-3">
			   	<ul type="none">
				   <c:forEach var="item" items="${todoList}">
				   		<li class="list-item">🏵️ ${item.getName()} &nbsp; &nbsp;<a href="/DeleteServlet?todo=${ item.getName() }" class="btn btn-danger">Delete</a></li>
					</c:forEach>
				</ul>		   		
		   </div>   
	 </div> 
	 <div class="d-flex justify-content-center mb-5">
			<form action="/dashboard" method="post">
			<div class="row">
			<div class="col-8">
				<input type="text" class="form-control" placeholder="Add new item" name="newToDo" aria-label="Add new item">
			</div>
			<div class="col-4">
				 <button type="submit" class="btn btn-primary">Add Item</button>
			</div>
			</div>
			</form>
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
		integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
		crossorigin="anonymous" type="text/javascript"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
		crossorigin="anonymous" type="text/javascript"></script>
</body>
</html>