package Almacen.Model.Objects;

import Almacen.Model.Objects.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile CollectionAttribute<Proveedor, Compra> compraCollection;
    public static volatile SingularAttribute<Proveedor, String> codigoproveedor;
    public static volatile SingularAttribute<Proveedor, String> nombreproveedor;
    public static volatile SingularAttribute<Proveedor, String> direccionproveedo;
    public static volatile SingularAttribute<Proveedor, String> fonoproveedor;

}