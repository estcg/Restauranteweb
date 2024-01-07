package com.edu.sena.colegioxyz.logica;

import com.edu.sena.colegioxyz.logica.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-06T17:19:24")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile ListAttribute<Profesor, Curso> cursos;
    public static volatile SingularAttribute<Profesor, Integer> codigo;
    public static volatile SingularAttribute<Profesor, String> apellido;
    public static volatile SingularAttribute<Profesor, Integer> categoria;
    public static volatile SingularAttribute<Profesor, Double> salario;
    public static volatile SingularAttribute<Profesor, String> nombre;

}