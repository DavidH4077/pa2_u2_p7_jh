package ec.edu.uce.ec.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.CalificacionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CalificacionService {

    @Inject
    private CalificacionRepository calificacionRepository;

    public void guardar(Calificacion calificacion) {
        this.calificacionRepository.create(calificacion);
    }

    public Optional<Calificacion> buscarPorID(Integer id) {
        return this.calificacionRepository.read(id);
    }

    public Optional<Calificacion> buscarPorComentario(String comentario) {
        return this.calificacionRepository.readByComentario(comentario);
    }

    public void actualizar(Calificacion calificacion) {
        this.calificacionRepository.update(calificacion);
    }

    public void eliminar(Integer id) {
        this.calificacionRepository.delete(id);
    }
}