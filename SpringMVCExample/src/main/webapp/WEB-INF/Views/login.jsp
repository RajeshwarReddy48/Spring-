<!DOCTYPE html>
<html>
<title>Welcome</title>
<body> My first Spring MVC Application
<p><font color="red">${errorMessage}</font></p>
<form action="/login.do" method="post">
Enter your Name<input type="text" name="name" />
Enter Your Password <input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>