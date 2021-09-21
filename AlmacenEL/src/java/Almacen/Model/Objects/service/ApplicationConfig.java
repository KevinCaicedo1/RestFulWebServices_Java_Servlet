/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Kevin Caicedo
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Almacen.Model.Objects.service.BodegaFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.CiudadFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.ClienteFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.CompraFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.DetallecompraFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.DetalleventaFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.EmpleadoFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.ProductoFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.ProductosbodegaFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.ProductostiendaFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.ProveedorFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.SalidaproductosFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.TiendaFacadeREST.class);
        resources.add(Almacen.Model.Objects.service.VentaFacadeREST.class);
    }
    
}
