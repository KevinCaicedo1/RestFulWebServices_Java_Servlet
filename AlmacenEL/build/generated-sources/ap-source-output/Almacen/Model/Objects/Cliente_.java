package Almacen.Model.Objects;

import Almacen.Model.Objects.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> direccioncliente;
    public static volatile CollectionAttribute<Cliente, Venta> ventaCollection;
    public static volatile SingularAttribute<Cliente, String> cedulacliente;
    public static volatile SingularAttribute<Cliente, String> emailcliente;
    public static volatile SingularAttribute<Cliente, String> fonocliente;
    public static volatile SingularAttribute<Cliente, String> nombrecliente;
    public static volatile SingularAttribute<Cliente, String> codigocliente;

}