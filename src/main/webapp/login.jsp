<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Movie</title>
</head>
<body>
  <h1>Book A Show</h1>
  <h6>Book Tickets to movies and more... </h6>
  <div>
  <h3> please login to veiw movies and events happening in your location</h3>
  </div>
  <div>
     <img src="one.jpg" alt="login-wallpaper" width=200px height=200px>
     <form action="/login_credencials" method="GET">
      <div>
       <label for="mail">UserName:</label>
       <input type="email" id="mail" name="e_mail" placeholder="example@gamil.com" required />
      </div>
      <div>
       <label for="pass">Password:</label>
       <input type="password" id="pass" name="password" maxlength="12" required />
      </div>
      
      <button type="submit">login</button>
     </form>
       ${in_correct}
     <div>
      <a href="/sign_in.jsp">
      <button>SignUp</button>
      </a>
     </div>
  </div>

</body>
</html>