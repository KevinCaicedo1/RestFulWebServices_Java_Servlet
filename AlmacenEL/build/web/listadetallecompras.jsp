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
        <h1>Detalle Compras</h1>
        
    <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>CODIGO COMPRA</th>
                            <th>FECHA COMPRA</th>
                            <th>NOMBRE PROVEEDOR</th>
                            <th>NOMBRE PRODUCTO</th>
                            <th>PRECIO PRODUCTO</th>
                            <th>CANTIDAD</th>
                            <th>MARCA</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach  items="${dcompras}" var="dcompra">

                            <tr>
                                <td>   ${dcompra.detallecompraPK.codigodetallecompra}</td>
                                <td>  ${dcompra.compra.compraPK.codigocompra}</td>
                                <td> ${dcompra.compra.fechacompra} </td>
                                <td>  ${dcompra.compra.proveedor.nombreproveedor}</td>
                                <td>${dcompra.productosbodega.producto.nombreproducto}</td>
                                <td>   ${dcompra.precioproductocompra}</td>
                                <td>  ${dcompra.cantidadcompraproducto}</td>
                                <td> ${dcompra.productosbodega.producto.marcaproducto} </td>                                
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
