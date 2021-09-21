<%-- 
    Document   : index
    Created on : Sep 2, 2021, 1:52:45 PM
    Author     : Kevin Caicedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="html/head.html" %>
    </head>
    <body>

        <header id="header" class="fixed-top">
    <div class="container d-flex align-items-center justify-content-between">

      <h1 class="logo"><a href="index.jsp">Base De Datos</a></h1>
    
    

    </div>
  </header><!-- End Header -->

        <section id="hero" class="d-flex align-items-center">
            
            <div class="container position-relative"  data-aos-delay="100" >
                <div class="row justify-content-center">
                    <div class="col-xl-7 col-lg-9 text-center">
                        <h1>Datos Almacen Electrodomesticos</h1>
                        <h2></h2>
                    </div>
                </div>

                <div class="row icon-boxes">
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="200">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-stack-line"></i></div>
                            <h4 class="title"><a href="productos">Productos</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>

                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="300">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-archive-fill"></i></div>
                            <h4 class="title"><a href="productosbodega">Productos en Bodega</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>

                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="400">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-user-3-fill"></i></div>
                            <h4 class="title"><a href="clientes">Clientes</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>

                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="500">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-team-line"></i></div>
                            <h4 class="title"><a href="proveedores">Proveedores</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>

                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0" data-aos-delay="600">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-building-2-line"></i></div>
                            <h4 class="title"><a href="bodegas">Bodegas</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0" data-aos-delay="700">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-store-fill"></i></div>
                            <h4 class="title"><a href="tiendas">Tiendas</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0" data-aos-delay="800">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-gps-fill"></i></div>
                            <h4 class="title"><a href="ciudades">Ciudades</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0" data-aos-delay="900">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-shopping-bag-line"></i></div>
                            <h4 class="title"><a href="compras">Compras</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                     <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0" data-aos-delay="1000">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-newspaper-line"></i></div>
                            <h4 class="title"><a href="detallecompras">Detalle Compras</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                     <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="1100">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-survey-fill"></i></div>
                            <h4 class="title"><a href="detalleventas">Detalle Ventas</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                     <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="1200">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-file-user-line"></i></div>
                            <h4 class="title"><a href="empleados">Empleados</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                     <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="1300">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-product-hunt-fill"></i></div>
                            <h4 class="title"><a href="productostienda">Productos Tienda</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="1400">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-flutter-fill"></i></div>
                            <h4 class="title"><a href="salidasbodega">Salidas Bodega</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    <div class="col-md-6 col-lg-3 d-flex align-items-stretch mb-5 mb-lg-0"  data-aos-delay="1500">
                        <div class="icon-box">
                            <div class="icon"><i class="ri-shopping-bag-3-fill"></i></div>
                            <h4 class="title"><a href="ventas">Ventas</a></h4>
                            <p class="description"></p>
                        </div>
                    </div>
                    
                    

                </div>
            </div>
        </section>
    </body>
</html>
