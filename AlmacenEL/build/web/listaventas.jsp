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
        <h1>VENTAS</h1>

        <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>CODIGO</th>
                                <th>NOMBRE CLIENTE</th>
                                <th>EMAIL CLIENTE</th>
                                <th>CEDULA CLIENTE</th>
                                <th>NOMBRE VENDEDOR</th>   
                                <th>FECHA VENTA</th>   
                                <th>IMPUESTO VENTA</th>   
                                <th>TOTAL VENTA</th>   
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach  items="${ventas}" var="venta">
                                <tr>
                                    <td>${venta.ventaPK.codigoventa} </td>
                                    <td>${venta.cliente.nombrecliente}</td>
                                    <td> ${venta.cliente.emailcliente}</td>
                                    <td>  ${venta.cliente.cedulacliente} </td>
                                    <td>  ${venta.codigoempleado.nombreempleado} </td>
                                    <td>  ${venta.fechaventa}</td>
                                    <td>   ${venta.impuestoventa}  </td>
                                    <td> ${venta.totalventa}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
