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
        <h1>Clientes</h1>
       
         <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>CODIGO</th>
                                <th>NOMBRE</th>
                                <th>DIRECCIÓN</th>
                                <th>EMAIL</th>
                                <th>TELÉFONO</th>
                                <th>CEDULA</th>
                              
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${clientes}" var="cliente">
                            
                            <tr>
                                <td> ${cliente.codigocliente}</td>
                                <td> ${cliente.nombrecliente}</td>
                                <td> ${cliente.direccioncliente}</td>
                                <td> ${cliente.emailcliente}</td>
                                <td> ${cliente.fonocliente}</td>
                                <td> ${cliente.cedulacliente}</td>
                                
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
