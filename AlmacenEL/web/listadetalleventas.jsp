<%-- 
    Document   : listabodegas
    Created on : Aug 31, 2021, 11:04:43 AM
    Author     : Kevin Caicedo
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="html/head.html" %>
      
    </head>
    <body>
        <%@include file="html/header.html" %>
        <h1>Detalle Ventas</h1>
   
        <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>CODIGO PRODUCTO</th>
                            <th>CODIGO VENTA</th>
                            <th>TIENDA</th>
                             <th>NOMBRE EMPLEADO</th>
                             <th>CLIENTE</th>
                            <th>NOMBRE PRODUCTO</th>
                            <th>MODELO PRODUCTO</th>
                            <th>MARCA PRODUCTO</th>
                            <th>CANTIDAD PRODUCTO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${dventas}" var="dventa">

                            <tr>
                                <td>   ${dventa.detalleventaPK.codigodetalleventa}</td>
                                <td> ${dventa.productostienda.productostiendaPK.codigoproductotienda}</td>
                                <td> ${dventa.detalleventaPK.codigoventa}</td>
                                <td>  ${dventa.productostienda.tienda.nombretienda}</td>
                                <td>   ${dventa.venta.codigoempleado.nombreempleado} </td>
                                <td> ${dventa.venta.cliente.nombrecliente}</td>
                                <td> ${dventa.productostienda.salidaproductos.productosbodega.producto.nombreproducto}</td>
                                <td> ${dventa.productostienda.salidaproductos.productosbodega.producto.modeloproducto}</td>
                                <td> ${dventa.productostienda.salidaproductos.productosbodega.producto.marcaproducto}</td>
                                <td>   ${dventa.cantidadproductoventa}</td>                              
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
