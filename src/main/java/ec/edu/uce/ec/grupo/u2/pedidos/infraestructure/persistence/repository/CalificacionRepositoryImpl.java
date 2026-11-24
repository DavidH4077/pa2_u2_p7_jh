package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.CalificacionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class CalificacionRepositoryImpl implements CalificacionRepository {
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Calificacion calificacion) {
        this.entityManager.persist(calificacion);
        
    }

    @Override
    public Calificacion read(Integer id) {
        
        return this.entityManager.find(Calificacion.class, id);
    }

    @Override
    public void update(Calificacion calificacion) {
       this.entityManager.merge(calificacion);
    }

    @Override
    public void delete(Integer id) {
        Calificacion calificacion=this.read(id);
        this.entityManager.remove(calificacion);
    }
}
