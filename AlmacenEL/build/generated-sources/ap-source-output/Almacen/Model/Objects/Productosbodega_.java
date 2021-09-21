package Almacen.Model.Objects;

import Almacen.Model.Objects.Bodega;
import Almacen.Model.Objects.Detallecompra;
import Almacen.Model.Objects.Producto;
import Almacen.Model.Objects.ProductosbodegaPK;
import Almacen.Model.Objects.Salidaproductos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Productosbodega.class)
public class Productosbodega_ { 

    public static volatile SingularAttribute<Productosbodega, Bodega> codigobodega;
    public static volatile CollectionAttribute<Productosbodega, Salidaproductos> salidaproductosCollection;
    public static volatile SingularAttribute<Productosbodega, ProductosbodegaPK> productosbodegaPK;
    public static volatile SingularAttribute<Productosbodega, BigDecimal> precioproductobodega;
    public static volatile SingularAttribute<Productosbodega, Date> fechaexistenciaproducto;
    public static volatile SingularAttribute<Productosbodega, Integer> cantidadproductobodega;
    public static volatile SingularAttribute<Productosbodega, Producto> producto;
    public static volatile SingularAttribute<Productosbodega, Integer> cantidadminimaproducto;
    public static volatile CollectionAttribute<Productosbodega, Detallecompra> detallecompraCollection;

}