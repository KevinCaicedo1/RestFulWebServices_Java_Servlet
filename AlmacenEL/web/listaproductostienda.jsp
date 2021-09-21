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
        <h1>PRODUCTOS TIENDA</h1>
     
     

    <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>NOMBRE PRODUCTO</th>
                            <th>CIUDAD TIENDA</th>
                            <th>NOMBRE TIENDA</th>
                           
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach  items="${productostienda}" var="productotienda">

                            <tr>
                                <td>${productotienda.productostiendaPK.codigoproductotienda}</td>
                                <td> ${productotienda.salidaproductos.productosbodega.producto.nombreproducto}</td>
                                <td> ${productotienda.tienda.ciudad.nombreciudad} </td>
                                <td>  ${productotienda.tienda.nombretienda}  </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
