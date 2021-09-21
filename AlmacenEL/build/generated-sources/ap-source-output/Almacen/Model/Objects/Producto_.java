package Almacen.Model.Objects;

import Almacen.Model.Objects.Productosbodega;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> codigoproducto;
    public static volatile SingularAttribute<Producto, Integer> garantiamesesproducto;
    public static volatile CollectionAttribute<Producto, Productosbodega> productosbodegaCollection;
    public static volatile SingularAttribute<Producto, String> nombreproducto;
    public static volatile SingularAttribute<Producto, String> modeloproducto;
    public static volatile SingularAttribute<Producto, String> marcaproducto;

}