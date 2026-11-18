package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

public class Empaque {
    private Integer id;
    private String tipoEmpaque;
    private double pesoEmpaque;
    private boolean esFragil;
    private String mensajeRegalo;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoEmpaque() {
        return tipoEmpaque;
    }
    public void setTipoEmpaque(String tipoEmpaque) {
        this.tipoEmpaque = tipoEmpaque;
    }
    public double getPesoEmpaque() {
        return pesoEmpaque;
    }
    public void setPesoEmpaque(double pesoEmpaque) {
        this.pesoEmpaque = pesoEmpaque;
    }
    public boolean isEsFragil() {
        return esFragil;
    }
    public void setEsFragil(boolean esFragil) {
        this.esFragil = esFragil;
    }
    public String getMensajeRegalo() {
        return mensajeRegalo;
    }
    public void setMensajeRegalo(String mensajeRegalo) {
        this.mensajeRegalo = mensajeRegalo;
    }
    
}
