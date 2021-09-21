/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Productosbodega;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.ProductosbodegaFacadeREST;
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
@WebServlet("/productosbodega")
public class ProductosBodegaServlet extends HttpServlet {

    @Inject
    ProductosbodegaFacadeREST productobodega;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Productosbodega> productosbodega = productobodega.findAll();
         System.out.println("productosbodega:" + productosbodega);
        request.setAttribute("productosbodega", productosbodega);
        request.getRequestDispatcher("/listaproductosbodega.jsp").forward(request, response);
    }
 

}
