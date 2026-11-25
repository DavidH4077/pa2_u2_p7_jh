package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "seguro_pedido") //nombre de la tabla en la base de datos
public class Seguro {
    @Id
    @SequenceGenerator(name = "pddseguro_seq", sequenceName = "pddseguro_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pddseguro_seq")

    @Column (name = "seg_pdd_id") //nombre de la columna en la base de datos
    private Integer id;
    @Column (name = "seg_pdd_tipo") //nombre de la columna en la base de datos
    private String tipoSeguro;
    @Column (name = "seg_pdd_valor") //nombre de la columna en la base de datos
    private double valorSeguro;
    @Column (name = "seg_pdd_cobert") //nombre de la columna en la base de datos
    private String coberturaSeguro;
    @Column (name = "seg_pdd_num") //nombre de la columna en la base de datos
    private String numeroPoliza;

    
    
    @Override
    public String toString() {
        return "Seguro [id=" + id + ", tipoSeguro=" + tipoSeguro + ", valorSeguro=" + valorSeguro + ", coberturaSeguro="
                + coberturaSeguro + ", numeroPoliza=" + numeroPoliza + "]";
    }
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
