package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;

public interface CalificacionRepository {
    public void create(Calificacion calificacion);
    public Optional<Calificacion> read(Integer id);
    public Optional<Calificacion> readByComentario(String comentario);
    public List<Calificacion> readAll();
    public void update(Calificacion calificacion);
    public void delete(Integer id);
}