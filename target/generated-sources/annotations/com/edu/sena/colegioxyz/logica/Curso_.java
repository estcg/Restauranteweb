package com.edu.sena.colegioxyz.logica;

import com.edu.sena.colegioxyz.logica.Matricula;
import com.edu.sena.colegioxyz.logica.Profesor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-06T17:19:24")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> horas;
    public static volatile SingularAttribute<Curso, Integer> codigo;
    public static volatile SingularAttribute<Curso, Double> valor;
    public static volatile SingularAttribute<Curso, Profesor> profesor;
    public static volatile SingularAttribute<Curso, String> nombre;
    public static volatile ListAttribute<Curso, Matricula> matriculas;

}