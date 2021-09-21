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
        <h1>Hello World!</h1>
       

    <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>NOMBRE PRODUCTO</th>
                            <th>MARCA PRODUCTO</th>
                            <th>MODELO PRODUCTO</th>
                            <th>CANTIDAD SALIDA</th>                        
                            <th>FECHA SALIDA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach  items="${salidas}" var="salida">

                            <tr>
                                <td>${salida.salidaproductosPK.codigosalidaproducto}</td>
                                <td>${salida.productosbodega.producto.nombreproducto}</td>
                                <td> ${salida.productosbodega.producto.marcaproducto} </td>
                                <td>  ${salida.productosbodega.producto.modeloproducto} </td>
                                <td> ${salida.cantidadsalidaproducto} </td>
                                <td> ${salida.fechasalidaproducto}  </td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
