<%-- 
    Document   : listar.jsp
    Created on : 5/07/2023, 9:31:48 p. m.
    Author     : Programer
--%>

<%@page import="com.edu.sena.colegioxyz.logica.Estudiante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Estudiantes</h1>

        <%
            List<Estudiante> estudiantes = (List) request.getSession().getAttribute("listaEstudiantes");
            int cont = 1;
            for (Estudiante e : estudiantes) {

        %>

        

        
        <p><b>usuario Numero:<%=cont%> </b></p>
        
        <p><%=e%> </p>

        <%cont=cont+1;%> 
        
        <% }%>

    </body>
</html>
