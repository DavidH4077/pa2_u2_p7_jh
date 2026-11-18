package ec.edu.uce.ec.grupo.u2.pedidos.domain.model;

public class CalificacionPedido {
    private Integer id;
    private Integer calificacion;
    private String comentario;
    private boolean llegaATiempo;
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
