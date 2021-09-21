/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects.service;

import Almacen.Model.Objects.Productostienda;
import Almacen.Model.Objects.ProductostiendaPK;
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
@Path("almacen.model.objects.productostienda")
public class ProductostiendaFacadeREST extends AbstractFacade<Productostienda> {

    @PersistenceContext(unitName = "AlmacenELPU")
    private EntityManager em;

    private ProductostiendaPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codigoproducto=codigoproductoValue;codigoproductosbodega=codigoproductosbodegaValue;codigosalidaproducto=codigosalidaproductoValue;codigoproductotienda=codigoproductotiendaValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Almacen.Model.Objects.ProductostiendaPK key = new Almacen.Model.Objects.ProductostiendaPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
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
        return key;
    }

    public ProductostiendaFacadeREST() {
        super(Productostienda.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Productostienda entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Productostienda entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.ProductostiendaPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Productostienda find(@PathParam("id") PathSegment id) {
        Almacen.Model.Objects.ProductostiendaPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Productostienda> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Productostienda> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
