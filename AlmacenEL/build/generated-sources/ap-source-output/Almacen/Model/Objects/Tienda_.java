package Almacen.Model.Objects;

import Almacen.Model.Objects.Ciudad;
import Almacen.Model.Objects.Productostienda;
import Almacen.Model.Objects.TiendaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Tienda.class)
public class Tienda_ { 

    public static volatile CollectionAttribute<Tienda, Productostienda> productostiendaCollection;
    public static volatile SingularAttribute<Tienda, String> direcciontienda;
    public static volatile SingularAttribute<Tienda, Ciudad> ciudad;
    public static volatile SingularAttribute<Tienda, String> fonotienda;
    public static volatile SingularAttribute<Tienda, TiendaPK> tiendaPK;
    public static volatile SingularAttribute<Tienda, String> nombretienda;

}