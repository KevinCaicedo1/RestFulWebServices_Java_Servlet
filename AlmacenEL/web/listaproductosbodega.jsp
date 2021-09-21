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
        <h1>Productos en Bodega</h1>
   
    <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>CODIGO BODEGA</th>
                            <th>NOMBRE BODEGA</th>
                            <th>DIRECCION BODEGA</th>
                            <th>TELEFONO BODEGA</th>
                            <th>CODIGO PRODUCTO</th>
                            <th>NOMBRE PRODUCTO</th>
                            <th>MODELO</th>
                            <th>MARCA</th>
                            <th>CANTIDAD MINIMA</th>
                            <th>CANTIDAD EXISTENTE</th>
                            <th>PRECIO</th>
                            <th>FECHA EXISTENCIA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${productosbodega}" var="productobodega">

                            <tr>
                                <td> ${productobodega.codigobodega.codigobodega}</td>
                                <td> ${productobodega.codigobodega.nombrebodega}</td>
                                <td> ${productobodega.codigobodega.direccionbodega}</td>
                                <td> ${productobodega.codigobodega.fonobodega}  </td>
                                <td> ${productobodega.producto.codigoproducto}  </td>   
                                <td>  ${productobodega.producto.nombreproducto}</td>
                                <td> ${productobodega.producto.modeloproducto}</td>
                                <td> ${productobodega.producto.marcaproducto}</td>
                                <td>  ${productobodega.cantidadminimaproducto} </td>
                                <td>  ${productobodega.cantidadproductobodega} </td>   
                                <td>   ${productobodega.precioproductobodega} </td>
                                <td> ${productobodega.fechaexistenciaproducto} </td>   
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    </body>
</html>
