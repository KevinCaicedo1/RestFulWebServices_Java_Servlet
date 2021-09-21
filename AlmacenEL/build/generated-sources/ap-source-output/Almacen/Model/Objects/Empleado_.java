package Almacen.Model.Objects;

import Almacen.Model.Objects.Venta;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-08T09:38:48")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile CollectionAttribute<Empleado, Venta> ventaCollection;
    public static volatile SingularAttribute<Empleado, String> codigoempleado;
    public static volatile SingularAttribute<Empleado, String> nombreempleado;
    public static volatile SingularAttribute<Empleado, String> cedulaempleado;
    public static volatile SingularAttribute<Empleado, BigDecimal> porcentajecomisionempleado;
    public static volatile SingularAttribute<Empleado, String> fonoempleado;
    public static volatile SingularAttribute<Empleado, BigDecimal> sueldobaseempleado;

}