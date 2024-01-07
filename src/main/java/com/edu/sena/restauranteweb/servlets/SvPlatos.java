/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.sena.restauranteweb.servlets;

import com.edu.sena.restauranteweb.logica.Controladora;
import com.edu.sena.restauranteweb.logica.Platos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Programer 
 */
@WebServlet(name = "SvPlatos", urlPatterns = {"/SvPlatos"})
public class SvPlatos extends HttpServlet {
    
    Controladora controladora= new Controladora();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* 
        List<Estudiante>estudiantes = new ArrayList<>();
        
        estudiantes.add(new Platos(101, "Juan", "Perez", 25));
        estudiantes.add(new Platos(102, "Maria", "Lopez", 14));
        estudiantes.add(new Platos(103, "Luisa", "Ruiz", 30));
        estudiantes.add(new Platos(104, "Jose", "Duran", 24));
        
        
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaEstudiantes", estudiantes);
        
        response.sendRedirect("listar.jsp");
        
        */
       List<Platos>platos = new ArrayList<>();
       platos= controladora.consultarPlatos();
       
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaEstudiantes", platos);
        
        response.sendRedirect("listar.jsp");
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        int codigo= Integer.parseInt(request.getParameter("codigo"));
        String nombre= request.getParameter("nombre");
        
        int precio=Integer.parseInt(request.getParameter("precio"));
        
      //  System.out.println("codigo= "+codigo);
      
      Platos e = new Platos();
      e.setCodigo(codigo);
      e.setNombre(nombre);
      e.setPrecio(precio);
      
      
      controladora.crearPlatos(e);
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
