<%-- 
    Document   : listar.jsp
    Created on : 5/07/2023, 9:31:48 p. m.
    Author     : Programer
--%>

<%@page import="com.edu.sena.restauranteweb.logica.Platos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Platos</h1>

        <%
            List<Platos> platos = (List) request.getSession().getAttribute("listaPlatos");
            int cont = 1;
            for (Platos e : platos) {

        %>

        

        
        <p><b>usuario Numero:<%=cont%> </b></p>
        
        <p><%=e%> </p>

        <%cont=cont+1;%> 
        
        <% }%>

    </body>
</html>
