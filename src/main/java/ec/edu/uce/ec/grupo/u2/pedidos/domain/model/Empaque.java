package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empq") //nombre de la tabla en la base de datos
public class Empaque {

    @Id
    @SequenceGenerator(name = "pddempq_seq", sequenceName = "pddempq_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pddempq_seq")

    @Column(name = "empq_id") //nombre de la columna en la base de datos
    private Integer id;
    @Column(name = "empq_tipo") //nombre de la columna en la base de datos
    private String tipoEmpaque;
    @Column(name = "empq_peso") //nombre de la columna en la base de datos
    private double pesoEmpaque;
    @Column(name = "empq_fragil") //nombre de la columna en la base de datos
    private boolean esFragil;
    @Column(name = "empq_msj") //nombre de la columna en la base de datos
    private String mensajeRegalo;

    
    @Override
    public String toString() {
        return "Empaque [id=" + id + ", tipoEmpaque=" + tipoEmpaque + ", pesoEmpaque=" + pesoEmpaque + ", esFragil="
                + esFragil + ", mensajeRegalo=" + mensajeRegalo + "]";
    }

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
