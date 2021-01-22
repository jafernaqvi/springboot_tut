<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Add<br>
	<form action="addAlien">
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>
		<input type="submit"><br>
	</form>
	
	<br>Get<br>
	<form action="getAlien">
		<input type="text" name="id"><br>
		<input type="submit"><br>
	</form>
	
	<br>Update<br>
	<form action="updateAlien">
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>
		<input type="submit"><br>
	</form>
	<br>Delete<br>
	<form action="deleteAlien">
		<input type="text" name="id"><br>
		<input type="submit"><br>
	</form>
	
		<br>Queries<br>
	<form action="fetchAlienByQuery">
		<input type="text" name="id"><br>
		<input type="submit"><br>
	</form>
</body>
</html>