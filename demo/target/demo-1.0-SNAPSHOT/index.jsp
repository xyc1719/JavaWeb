<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>this is the title.</title>
</head>
<body>
<!--print by jsp-->
<h1><%= "Hello World! ---by JSP" %></h1>
<br/>
<!--print by html-->
<h2>Hi the World!  ---by html</h2>
<br/>
<h3>
  <%
    System.out.println("Hello world. --written by out.println()");
  %>
</h3>
<br/>
<a href="hello-servlet">Visit Hello Servlet</a>
</body>
</html>