package br.cesjf.hotellucena.model;

import br.cesjf.hotellucena.model.Apartamento;
import br.cesjf.hotellucena.model.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-06T19:33:36")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, Integer> codigoReserva;
    public static volatile SingularAttribute<Reservas, Integer> numeroHospedes;
    public static volatile SingularAttribute<Reservas, Date> dataEntrada;
    public static volatile SingularAttribute<Reservas, Usuarios> usuarioscodUsuario;
    public static volatile SingularAttribute<Reservas, Double> valorPago;
    public static volatile SingularAttribute<Reservas, Date> dataSaida;
    public static volatile SingularAttribute<Reservas, Apartamento> apartamentocodigoApartamento;
    public static volatile SingularAttribute<Reservas, String> status;

}