package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cal_pdd") //nombre de la tabla en la base de datos
public class CalificacionPedido {

    @Id
    @SequenceGenerator(name = "pddcal_seq", sequenceName = "pddcal_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pddcal_seq")

    @Column(name = "cal_pdd_id") //nombre de la columna en la base de datos
    private Integer id;
    @Column(name = "cal_pdd_califi") //nombre de la columna en la base de datos
    private Integer calificacion;
    @Column(name = "cal_pdd_coment") //nombre de la columna en la base de datos
    private String comentario;
    @Column(name = "cal_pdd_a_tmp") //nombre de la columna en la base de datos
    private boolean llegaATiempo;
    @Column(name = "cal_pdd_cump_expec") //nombre de la columna en la base de datos
    private boolean cumpleExpectativas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isLlegaATiempo() {
        return llegaATiempo;
    }

    public void setLlegaATiempo(boolean llegaATiempo) {
        this.llegaATiempo = llegaATiempo;
    }

    public boolean isCumpleExpectativas() {
        return cumpleExpectativas;
    }

    public void setCumpleExpectativas(boolean cumpleExpectativas) {
        this.cumpleExpectativas = cumpleExpectativas;
    }

}
