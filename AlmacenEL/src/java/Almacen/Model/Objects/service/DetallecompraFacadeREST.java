/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.service;

import Almacen.Model.Objects.Detallecompra;
import Almacen.Model.Objects.DetallecompraPK;
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
@Path("almacen.model.objects.detallecompra")
public class DetallecompraFacadeREST extends AbstractFacade<Detallecompra> {

    @PersistenceContext(unitName = "AlmacenELPU")
    private EntityManager em;

    private DetallecompraPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codigodetallecompra=codigodetallecompraValue;codigoproducto=codigoproductoValue;codigoproductosbodega=codigoproductosbodegaValue;codigoproveedor=codigoproveedorValue;codigocompra=codigocompraValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Almacen.Model.Objects.DetallecompraPK key = new Almacen.Model.Objects.DetallecompraPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codigodetallecompra = map.get("codigodetallecompra");
        if (codigodetallecompra != null && !codigodetallecompra.isEmpty()) {
            key.setCodigodetallecompra(codigodetallecompra.get(0));
        }
        java.util.List<String> codigoproducto = map.get("codigoproducto");
        if (codigoproducto != null && !codigoproducto.isEmpty()) {
            key.setCodigoproducto(codigoproducto.get(0));
        }
        java.util.List<String> codigoproductosbodega = map.get("codigoproductosbodega");
        if (codigoproductosbodega != null && !codigoproductosbodega.isEmpty()) {
            key.setCodigoproductosbodega(codigoproductosbodega.get(0));
        }
        java.util.List<String> codigoproveedor = map.get("codigoproveedor");
        if (codigoproveedor != null && !codigoproveedor.isEmpty()) {
            key.setCodigoproveedor(codigoproveedor.get(0));
        }
        java.util.List<String> codigocompra = map.get("codigocompra");
        if (codigocompra != null && !codigocompra.isEmpty()) {
            key.setCodigocompra(codigocompra.get(0));
        }
        return key;
    }

    public DetallecompraFacadeREST() {
        super(Detallecompra.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Detallecompra entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Detallecompra entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.DetallecompraPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Detallecompra find(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.DetallecompraPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Detallecompra> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Detallecompra> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
