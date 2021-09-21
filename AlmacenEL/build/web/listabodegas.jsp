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
        <h1>Datos Bodega</h1>

        <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>CÓDIGO</th>
                                <th>NOMBRE</th>
                                <th>DIRECCIÓN</th>
                                <th>TELEFONO</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${bodegas}" var="bodega">
                            
                            <tr>
                                <td>${bodega.codigobodega}</td>
                                <td>${bodega.nombrebodega}</td>
                                <td>${bodega.direccionbodega}</td>
                                <td>${bodega.fonobodega}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
