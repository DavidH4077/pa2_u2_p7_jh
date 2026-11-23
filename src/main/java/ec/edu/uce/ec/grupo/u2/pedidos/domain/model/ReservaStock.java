package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva_stock") //nombre de la tabla en la base de datos
public class ReservaStock {

    @Id
    @SequenceGenerator(name = "pddreserva_seq", sequenceName = "pddreserva_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pddreserva_seq")

    @Column(name = "reserva_id")
    private Integer id;
    @Column(name = "reserva_cod_itm")
    private String codigoItem;
    @Column(name = "reserva_cantidad")
    private Integer cantidadReservada;
    @Column(name = "reserva_estado")
    private String estadoReserva;
    @Column(name = "reserva_fecha")
    private String fechaReserva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public Integer getCantidadReservada() {
        return cantidadReservada;
    }

    public void setCantidadReservada(Integer cantidadReservada) {
        this.cantidadReservada = cantidadReservada;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}
