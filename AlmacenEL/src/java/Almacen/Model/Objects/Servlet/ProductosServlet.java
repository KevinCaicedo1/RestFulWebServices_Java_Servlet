/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Producto;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.ProductoFacadeREST;
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
@WebServlet("/productos")
public class ProductosServlet extends HttpServlet {

    @Inject
    ProductoFacadeREST producto;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Producto> productos = producto.findAll();
         System.out.println("productos:" + productos);
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("/listaproductos.jsp").forward(request, response);
    }
 

}
