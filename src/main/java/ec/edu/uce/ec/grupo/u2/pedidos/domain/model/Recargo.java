package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "recargo") //nombre de la tabla en la base de datos
public class Recargo {

    @Id
    @SequenceGenerator(name = "pddrecargo_seq", sequenceName = "pddrecargo_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pddrecargo_seq")

    @Column(name = "recargo_id")
    private Integer id;
    @Column(name = "recargo_valor")
    private double valorRecargo;
    @Column(name = "recargo_porcentaje")
    private double porcentajeRecargo;
    @Column(name = "recargo_beneficiario")
    private String beneficiario;
    @Column(name = "recargo_voluntario")
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
