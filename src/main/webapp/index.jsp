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
                <img src="img/sabor_italiano.png" alt="no carga">
            </header>

            <nav>
                
            </nav>

            <section>
                
                
                <article>

                    <fieldset> 
                        <legend>Registrar Platos</legend>
                        <form action="SvPlatos" method="POST">
                            <label for="txtCodigo">Código:</label><br>
                            <input type="number" id="txtCodigo" name="codigo" ><br>
                            <label for="txtNombre">Nombre:</label><br>
                            <input type="text" id="txtNombre" name="nombre"><br>
                            <label for="txtPrecio">Precio:</label><br>
                            <input type="number" id="txtPrecio" name="precio" ><br>
                            
                            <input type="submit" value="Registrar">
                        </form>
                    </fieldset>  
                </article>
                
                <article>
                    <fieldset> 
                        <legend>Listar Platos</legend>
                        <p>Para listar platos presione el siguiente boton</p>
                        
                        <form action="SvPlatos" method="GET">
                    
                            <input type="submit" value="Consultar">
                        </form>
                    </fieldset>  
                </article>
                
            </section>

            <footer>

                <h6>Restaurante Sabor Italiano</h6>
            </footer>

        </div>
    </body>
</html>
