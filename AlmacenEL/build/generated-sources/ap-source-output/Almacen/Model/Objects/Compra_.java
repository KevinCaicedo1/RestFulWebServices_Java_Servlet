package Almacen.Model.Objects;

import Almacen.Model.Objects.CompraPK;
import Almacen.Model.Objects.Detallecompra;
import Almacen.Model.Objects.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, String> descripcioncompra;
    public static volatile SingularAttribute<Compra, Proveedor> proveedor;
    public static volatile SingularAttribute<Compra, CompraPK> compraPK;
    public static volatile SingularAttribute<Compra, Date> fechacompra;
    public static volatile CollectionAttribute<Compra, Detallecompra> detallecompraCollection;

}