/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Detallecompra;
import Almacen.Model.Objects.Detalleventa;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.DetallecompraFacadeREST;
import Almacen.Model.Objects.service.DetalleventaFacadeREST;
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
@WebServlet("/detalleventas")
public class DetalleVentasServlet extends HttpServlet {

    @Inject
    DetalleventaFacadeREST dventa;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Detalleventa> dventas = dventa.findAll();
         System.out.println("dventas:" + dventas);
        request.setAttribute("dventas", dventas);
        request.getRequestDispatcher("/listadetalleventas.jsp").forward(request, response);
    }
 

}
