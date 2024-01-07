/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.restauranteweb.persistencia;

//import com.edu.sena.colegioxyz.logica.Curso;

import com.edu.sena.restauranteweb.logica.Platos;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programer
 */
public class ControladoraPersistencia {
    
    PlatosJpaController  platosJpaController= new PlatosJpaController();
   

    
    public void crearPlatos(Platos e){
    
        try {
            platosJpaController.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<Platos> consultarPlatos(){
    
    return platosJpaController.findPlatosEntities();
    }
    
    
}
