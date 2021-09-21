package Almacen.Model.Objects;

import Almacen.Model.Objects.Compra;
import Almacen.Model.Objects.DetallecompraPK;
import Almacen.Model.Objects.Productosbodega;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Detallecompra.class)
public class Detallecompra_ { 

    public static volatile SingularAttribute<Detallecompra, Compra> compra;
    public static volatile SingularAttribute<Detallecompra, Productosbodega> productosbodega;
    public static volatile SingularAttribute<Detallecompra, DetallecompraPK> detallecompraPK;
    public static volatile SingularAttribute<Detallecompra, BigDecimal> precioproductocompra;
    public static volatile SingularAttribute<Detallecompra, Integer> cantidadcompraproducto;

}