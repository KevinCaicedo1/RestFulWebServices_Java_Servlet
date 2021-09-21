/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.service;

import Almacen.Model.Objects.Detalleventa;
import Almacen.Model.Objects.DetalleventaPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Kevin Caicedo
 */
@Stateless
@Path("almacen.model.objects.detalleventa")
public class DetalleventaFacadeREST extends AbstractFacade<Detalleventa> {

    @PersistenceContext(unitName = "AlmacenELPU")
    private EntityManager em;

    private DetalleventaPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codigodetalleventa=codigodetalleventaValue;codigoproducto=codigoproductoValue;codigoproductosbodega=codigoproductosbodegaValue;codigosalidaproducto=codigosalidaproductoValue;codigoproductotienda=codigoproductotiendaValue;codigocliente=codigoclienteValue;codigoventa=codigoventaValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Almacen.Model.Objects.DetalleventaPK key = new Almacen.Model.Objects.DetalleventaPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codigodetalleventa = map.get("codigodetalleventa");
        if (codigodetalleventa != null && !codigodetalleventa.isEmpty()) {
            key.setCodigodetalleventa(codigodetalleventa.get(0));
        }
        java.util.List<String> codigoproducto = map.get("codigoproducto");
        if (codigoproducto != null && !codigoproducto.isEmpty()) {
            key.setCodigoproducto(codigoproducto.get(0));
        }
        java.util.List<String> codigoproductosbodega = map.get("codigoproductosbodega");
        if (codigoproductosbodega != null && !codigoproductosbodega.isEmpty()) {
            key.setCodigoproductosbodega(codigoproductosbodega.get(0));
        }
        java.util.List<String> codigosalidaproducto = map.get("codigosalidaproducto");
        if (codigosalidaproducto != null && !codigosalidaproducto.isEmpty()) {
            key.setCodigosalidaproducto(codigosalidaproducto.get(0));
        }
        java.util.List<String> codigoproductotienda = map.get("codigoproductotienda");
        if (codigoproductotienda != null && !codigoproductotienda.isEmpty()) {
            key.setCodigoproductotienda(codigoproductotienda.get(0));
        }
        java.util.List<String> codigocliente = map.get("codigocliente");
        if (codigocliente != null && !codigocliente.isEmpty()) {
            key.setCodigocliente(codigocliente.get(0));
        }
        java.util.List<String> codigoventa = map.get("codigoventa");
        if (codigoventa != null && !codigoventa.isEmpty()) {
            key.setCodigoventa(codigoventa.get(0));
        }
        return key;
    }

    public DetalleventaFacadeREST() {
        super(Detalleventa.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Detalleventa entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Detalleventa entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.DetalleventaPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Detalleventa find(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.DetalleventaPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Detalleventa> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Detalleventa> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
