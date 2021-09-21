package Almacen.Model.Objects;

import Almacen.Model.Objects.Productosbodega;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, String> codigobodega;
    public static volatile SingularAttribute<Bodega, String> direccionbodega;
    public static volatile CollectionAttribute<Bodega, Productosbodega> productosbodegaCollection;
    public static volatile SingularAttribute<Bodega, String> nombrebodega;
    public static volatile SingularAttribute<Bodega, String> fonobodega;

}