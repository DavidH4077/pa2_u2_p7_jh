package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;

public interface CalificacionRepository {
    
    public void create(Calificacion calificacion);

    public Calificacion read(Integer id);

    public void update(Calificacion calificacion);

    public void delete(Integer id);
}
