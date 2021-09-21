/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Tienda;
import Almacen.Model.Objects.service.TiendaFacadeREST;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin Caicedo
 */
@WebServlet("/tiendas")
public class TiendaServlet extends HttpServlet {

    @Inject
    TiendaFacadeREST tienda;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tienda> tiendas = tienda.findAll();
         System.out.println("tiendas:" + tiendas);
        request.setAttribute("tiendas", tiendas);
        request.getRequestDispatcher("/listatiendas.jsp").forward(request, response);
    }
 

}
