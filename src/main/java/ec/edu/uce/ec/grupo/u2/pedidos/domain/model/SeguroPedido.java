package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

public class SeguroPedido {
    private Integer id;
    private String tipoSeguro;
    private double valorSeguro;
    private String coberturaSeguro;
    private String numeroPoliza;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoSeguro() {
        return tipoSeguro;
    }
    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
    public double getValorSeguro() {
        return valorSeguro;
    }
    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
    public String getCoberturaSeguro() {
        return coberturaSeguro;
    }
    public void setCoberturaSeguro(String coberturaSeguro) {
        this.coberturaSeguro = coberturaSeguro;
    }
    public String getNumeroPoliza() {
        return numeroPoliza;
    }
    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    
}
