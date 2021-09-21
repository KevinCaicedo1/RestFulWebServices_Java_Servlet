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
        <h1>Empleados</h1>
           <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <thead>
                        <tr>
                            <th>NOMBRE</th>
                            <th>CEDULA</th>
                             <th>TELEFONO</th>
                             <th>COMISIÓN %</th>
                            <th>SUELDO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${empleados}" var="empleado">

                            <tr>
                                <td> ${empleado.nombreempleado}</td>
                                <td> ${empleado.cedulaempleado}</td>
                                <td> ${empleado.fonoempleado}</td>
                                <td> ${empleado.porcentajecomisionempleado} </td>
                                <td> ${empleado.sueldobaseempleado}  </td>                          
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
