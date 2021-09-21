package Almacen.Model.Objects;

import Almacen.Model.Objects.Cliente;
import Almacen.Model.Objects.Detalleventa;
import Almacen.Model.Objects.Empleado;
import Almacen.Model.Objects.VentaPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, BigDecimal> impuestoventa;
    public static volatile SingularAttribute<Venta, BigDecimal> totalventa;
    public static volatile SingularAttribute<Venta, Empleado> codigoempleado;
    public static volatile CollectionAttribute<Venta, Detalleventa> detalleventaCollection;
    public static volatile SingularAttribute<Venta, VentaPK> ventaPK;
    public static volatile SingularAttribute<Venta, BigDecimal> descuentoventa;
    public static volatile SingularAttribute<Venta, Date> fechaventa;

}