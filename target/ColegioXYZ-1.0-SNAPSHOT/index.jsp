<%-- 
    Document   : Estudiante
    Created on : 4/07/2023, 8:00:19 p. m.
    Author     : Programer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilo.css"/>
    </head>
     <body>
        <div class="cuerpo">

            <header>
                <img src="img/colegio_banner.jpg" alt="no carga">
            </header>

            <nav>
                
            </nav>

            <section>
                
                
                <article>

                    <fieldset> 
                        <legend>Registrar Estudiante</legend>
                        <form action="SvEstudiante" method="POST">
                            <label for="txtCodigo">Código:</label><br>
                            <input type="number" id="txtCodigo" name="codigo" ><br>
                            <label for="txtNombre">Nombre:</label><br>
                            <input type="text" id="txtNombre" name="combre"><br>
                            <label for="txtApellido">Apellido:</label><br>
                            <input type="text" id="txtApellido" name="apellido" ><br>
                            <label for="txtEdad">Edad</label><br>
                            <input type="number" id="txtEdad" name="edad" ><br><br>
                           
                            
                            <input type="submit" value="Registrar">
                        </form>
                    </fieldset>  
                </article>
                
                <article>
                    <fieldset> 
                        <legend>Listar Estudiantes</legend>
                        <p>Para listar estudiantes presione el siguiente boton</p>
                        
                        <form action="SvEstudiante" method="GET">
                    
                            <input type="submit" value="Consultar">
                        </form>
                    </fieldset>  
                </article>
                
            </section>

            <footer>

                <h6>Colegio XYZ</h6>
            </footer>

        </div>
    </body>
</html>
