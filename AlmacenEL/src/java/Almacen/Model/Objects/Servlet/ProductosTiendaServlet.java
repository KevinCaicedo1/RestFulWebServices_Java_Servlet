/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Productosbodega;
import Almacen.Model.Objects.Productostienda;
import Almacen.Model.Objects.service.BodegaFacadeREST;
import Almacen.Model.Objects.service.ProductosbodegaFacadeREST;
import Almacen.Model.Objects.service.ProductostiendaFacadeREST;
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
@WebServlet("/productostienda")
public class ProductosTiendaServlet extends HttpServlet {

    @Inject
    ProductostiendaFacadeREST productotienda;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Productostienda> productostienda = productotienda.findAll();
         System.out.println("productostienda:" + productostienda);
        request.setAttribute("productostienda", productostienda);
        request.getRequestDispatcher("/listaproductostienda.jsp").forward(request, response);
    }
 

}
