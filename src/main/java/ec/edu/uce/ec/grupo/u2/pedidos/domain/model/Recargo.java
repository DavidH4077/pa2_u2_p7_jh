package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

public class Recargo {
    private Integer id;
    private double valorRecargo;
    private double porcentajeRecargo;
    private String beneficiario;
    private boolean voluntario;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public double getValorRecargo() {
        return valorRecargo;
    }
    public void setValorRecargo(double valorRecargo) {
        this.valorRecargo = valorRecargo;
    }
    public double getPorcentajeRecargo() {
        return porcentajeRecargo;
    }
    public void setPorcentajeRecargo(double porcentajeRecargo) {
        this.porcentajeRecargo = porcentajeRecargo;
    }
    public String getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
    public boolean isVoluntario() {
        return voluntario;
    }
    public void setVoluntario(boolean voluntario) {
        this.voluntario = voluntario;
    }

    
}
