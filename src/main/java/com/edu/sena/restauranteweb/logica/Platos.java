/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.restauranteweb.logica;



import java.io.Serializable;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Programer
 */
@Entity
@Table(name = "platos")
public class Platos implements Serializable {
    
    @Id
    @Column(name = "cod_plato")
    private int codigo;
    
    @Column(name = "nom_plato")
    private String nombre;
    
    @Column(name = "prec_plato")
    private float precio;
  
 
// @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "estudiante_curso",joinColumns = @JoinColumn(name = "cod_est"),inverseJoinColumns = @JoinColumn(name = "cod_curs"))
//    public List<Curso> cursos;

  

    public Platos() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
