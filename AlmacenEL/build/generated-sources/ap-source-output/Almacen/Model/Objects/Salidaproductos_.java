package Almacen.Model.Objects;

import Almacen.Model.Objects.Productosbodega;
import Almacen.Model.Objects.Productostienda;
import Almacen.Model.Objects.SalidaproductosPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Salidaproductos.class)
public class Salidaproductos_ { 

    public static volatile CollectionAttribute<Salidaproductos, Productostienda> productostiendaCollection;
    public static volatile SingularAttribute<Salidaproductos, Productosbodega> productosbodega;
    public static volatile SingularAttribute<Salidaproductos, Date> fechasalidaproducto;
    public static volatile SingularAttribute<Salidaproductos, SalidaproductosPK> salidaproductosPK;
    public static volatile SingularAttribute<Salidaproductos, Integer> cantidadsalidaproducto;

}