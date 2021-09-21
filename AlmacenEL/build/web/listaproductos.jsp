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
        <h1>Productos</h1>
     
              <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                             <th>CODIGO</th>
                            <th>NOMBRE</th>
                            <th>MARCA</th>
                             <th>MODELO</th>
                             <th>GARANTIA MESES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${productos}" var="producto">

                            <tr>
                                <td> ${producto.codigoproducto}</td>
                                <td>  ${producto.nombreproducto}</td>
                                <td> ${producto.marcaproducto}</td>
                                <td>  ${producto.modeloproducto}  </td>
                                <td> ${producto.garantiamesesproducto}  </td>                          
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
