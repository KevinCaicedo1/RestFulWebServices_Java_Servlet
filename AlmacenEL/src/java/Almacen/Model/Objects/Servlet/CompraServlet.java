/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Ciudad;
import Almacen.Model.Objects.Compra;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.CiudadFacadeREST;
import Almacen.Model.Objects.service.CompraFacadeREST;
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
@WebServlet("/compras")
public class CompraServlet extends HttpServlet {

    @Inject
    CompraFacadeREST compra;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Compra> compras = compra.findAll();
         System.out.println("compras:" + compras);
        request.setAttribute("compras", compras);
        request.getRequestDispatcher("/listacompras.jsp").forward(request, response);
    }
 

}
