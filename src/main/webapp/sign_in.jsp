<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/data" method="GET">
      <div>
       <label for="mail">UserName:</label>
       <input type="email" id="mail" name="email" placeholder="example@gamil.com" required />
      </div>
      <div>
       <label for="pass">Password:</label>
       <input type="password" id="pass" name="password" maxlength="12" required />
      </div>
      <div>
       <label for="firstName">FirstName:</label>
       <input type="text" id="firstName" name=firstName required />
      </div>
      <div>
       <label for="lastName">LastName:</label>
       <input type="text" id="lastName" name=lastName required />
      </div>
      <div>
       <label for="phNo">phno:</label>
       <input type="text" id="phNo" name=phNo required />
      </div>
      <button type="submit">login</button> 
     </form>
</body>
</html>