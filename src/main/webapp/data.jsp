<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Book_Movie</title>
</head>
<body>
  <form action="/movie" method="GET">
      <div>
       <label for="movie">MovieName:</label>
       <input type="text" id="movie" name="movieName" placeholder="moviename" required />
      </div>
      <div>
       <label for="mail">UserName:</label>
       <input type="email" id="mail" name="e_mail" placeholder="example@gamil.com" required />
      </div>
      <button type="submit">Book</button> 
     </form>
</body>
</html>