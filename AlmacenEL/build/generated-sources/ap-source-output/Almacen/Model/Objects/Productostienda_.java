package Almacen.Model.Objects;

import Almacen.Model.Objects.Detalleventa;
import Almacen.Model.Objects.ProductostiendaPK;
import Almacen.Model.Objects.Salidaproductos;
import Almacen.Model.Objects.Tienda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Productostienda.class)
public class Productostienda_ { 

    public static volatile SingularAttribute<Productostienda, Tienda> tienda;
    public static volatile SingularAttribute<Productostienda, BigDecimal> preciounitarioventa;
    public static volatile CollectionAttribute<Productostienda, Detalleventa> detalleventaCollection;
    public static volatile SingularAttribute<Productostienda, ProductostiendaPK> productostiendaPK;
    public static volatile SingularAttribute<Productostienda, Integer> cantidadproductotienda;
    public static volatile SingularAttribute<Productostienda, Salidaproductos> salidaproductos;

}