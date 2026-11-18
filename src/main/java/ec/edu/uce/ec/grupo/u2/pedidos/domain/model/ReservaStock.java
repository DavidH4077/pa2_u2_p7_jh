package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

public class ReservaStock {
    private Integer id;
    private String codigoItem;
    private Integer cantidadReservada;
    private String estadoReserva;
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
