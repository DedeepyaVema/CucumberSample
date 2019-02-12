<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("userName");   
    String password = request.getParameter("password");
	   if(userName.equals("Deep8594")){
		   if(password.equals("Deepa")){
			   session.setAttribute("userid", userName);
		        response.sendRedirect("success.jsp");
		   }
		   else
			   out.println("Invalid password <a href='index.jsp'>try again</a>");
    } else {
    	out.println(userName);
    	out.println(password);
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>