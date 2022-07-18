<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	   <h1 class="text-center">Complex Form</h1>
		<form action="formHandler" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Your Name</label> <input
					type="text" class="form-control" aria-describedby="emailHelp"
					placeholder="Enter your name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Your Id</label> <input
					type="text" class="form-control" placeholder="Enter id" name="id">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Your DOB</label> <input
					type="date" class="form-control" placeholder="Enter DOB" name="dob">
			</div>
			<div class="form-group">
				<label for="cars">Choose a car:</label> <select name="cars"
					id="cars" multiple class="form-control">
					<option value="volvo">Volvo</option>
					<option value="saab">Saab</option>
					<option value="opel">Opel</option>
					<option value="audi">Audi</option>
				</select>
			</div>
			<div class="form-group">
				<label>Select Gender</label> <input type="radio" name="gender"
					value="male"> Male <input type="radio" name="gender"
					value="female"> Female

			</div>
			<div class="form-group">
			    <label for="exampleInputPassword1">Type</label>
				<select class="form-control" name="type">
					<option value="active">Active</option>
					<option value="deactive">Deactive</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>