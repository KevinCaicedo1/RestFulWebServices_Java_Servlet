/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Venta;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.VentaFacadeREST;
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
@WebServlet("/ventas")
public class VentaServlet extends HttpServlet {

    @Inject
    VentaFacadeREST venta;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Venta> ventas = venta.findAll();
         System.out.println("ventas:" + ventas);
        request.setAttribute("ventas", ventas);
        request.getRequestDispatcher("/listaventas.jsp").forward(request, response);
    }
 

}
