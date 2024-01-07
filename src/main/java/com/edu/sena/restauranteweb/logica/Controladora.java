/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.restauranteweb.logica;

import com.edu.sena.restauranteweb.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Programer
 */
public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia= new ControladoraPersistencia();
    
      public void crearPlatos(Platos e){
          
          controladoraPersistencia.crearPlatos(e);
      }
    
      
        public List<Platos> consultarPlatos(){
    
    return controladoraPersistencia.consultarPlatos();
    }
}
