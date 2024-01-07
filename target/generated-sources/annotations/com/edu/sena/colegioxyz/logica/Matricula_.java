package com.edu.sena.colegioxyz.logica;

import com.edu.sena.colegioxyz.logica.Curso;
import com.edu.sena.colegioxyz.logica.Estudiante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-06T17:19:24")
@StaticMetamodel(Matricula.class)
public class Matricula_ { 

    public static volatile SingularAttribute<Matricula, Estudiante> estudiante;
    public static volatile SingularAttribute<Matricula, Date> fecha;
    public static volatile SingularAttribute<Matricula, Curso> curso;
    public static volatile SingularAttribute<Matricula, Integer> id;

}