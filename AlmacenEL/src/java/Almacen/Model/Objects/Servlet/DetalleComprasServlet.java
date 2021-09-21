/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Detallecompra;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.DetallecompraFacadeREST;
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
@WebServlet("/detallecompras")
public class DetalleComprasServlet extends HttpServlet {

    @Inject
    DetallecompraFacadeREST dcompra;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Detallecompra> dcompras = dcompra.findAll();
         System.out.println("dcompras:" + dcompras);
        request.setAttribute("dcompras", dcompras);
        request.getRequestDispatcher("/listadetallecompras.jsp").forward(request, response);
    }
 

}
