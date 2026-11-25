package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.CalificacionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class CalificacionRepositoryImpl implements CalificacionRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Calificacion calificacion) {
        this.entityManager.persist(calificacion);
    }

    @Override
    public Optional<Calificacion> read(Integer id) {
        Calificacion calificacion = this.entityManager.find(Calificacion.class, id);
        return Optional.ofNullable(calificacion);
    }

    @Override
    public void update(Calificacion calificacion) {
        this.entityManager.merge(calificacion);
    }

    @Override
    public void delete(Integer id) {
        Optional<Calificacion> calificacion = this.read(id);
        calificacion.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Calificacion> readByComentario(String comentario) {
        try {
            TypedQuery<Calificacion> query = this.entityManager.createQuery(
                    "SELECT c FROM Calificacion c WHERE c.comentario = :comentarioVariable", Calificacion.class);
            query.setParameter("comentarioVariable", comentario);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Calificacion> readAll() {
        return null;
    }
}