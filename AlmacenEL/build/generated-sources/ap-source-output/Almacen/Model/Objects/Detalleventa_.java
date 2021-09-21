package Almacen.Model.Objects;

import Almacen.Model.Objects.DetalleventaPK;
import Almacen.Model.Objects.Productostienda;
import Almacen.Model.Objects.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Detalleventa.class)
public class Detalleventa_ { 

    public static volatile SingularAttribute<Detalleventa, Venta> venta;
    public static volatile SingularAttribute<Detalleventa, Productostienda> productostienda;
    public static volatile SingularAttribute<Detalleventa, DetalleventaPK> detalleventaPK;
    public static volatile SingularAttribute<Detalleventa, Integer> cantidadproductoventa;

}