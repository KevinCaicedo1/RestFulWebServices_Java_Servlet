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
        <h1>COMPRAS</h1>
    
              <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>CODIGO</th>
                                <th>FECHA</th>
                                <th>DESCRIPCIÓN</th>
                                <th>CODIGO PROVEEDOR</th>
                                <th>DIRECCION PROVEEDOR</th>
                                <th>NOMBRE PROVEEDOR</th>
                                <th>TELEFONO PROVEEDOR</th>
                              
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${compras}" var="compra">
                            
                            <tr>
                                <td>  ${compra.compraPK.codigocompra}</td>
                                <td> ${compra.fechacompra}</td>
                                <td> ${compra.descripcioncompra} </td>
                                <td>  ${compra.proveedor.codigoproveedor}</td>
                                <td> ${compra.proveedor.direccionproveedo}</td>
                                <td>  ${compra.proveedor.nombreproveedor}</td>
                                <td>   ${compra.proveedor.fonoproveedor}</td>
                                
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
