/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.Servlet;

import Almacen.Model.Objects.Proveedor;
import Almacen.Model.Objects.service.ProveedorFacadeREST;
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
@WebServlet("/proveedores")
public class ProveedorServlet extends HttpServlet {

    @Inject
    ProveedorFacadeREST proveedor;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Proveedor> proveedores = proveedor.findAll();
         System.out.println("proveedores:" + proveedores);
        request.setAttribute("proveedores", proveedores);
        request.getRequestDispatcher("/listaproveedores.jsp").forward(request, response);
    }
 

}
