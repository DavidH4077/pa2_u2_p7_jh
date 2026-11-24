package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.RecargoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class RecargoRepositoryImpl implements RecargoRepository {
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Recargo recargo) {
        this.entityManager.persist(recargo);
        
    }

    @Override
    public Recargo read(Integer id) {
        
        return this.entityManager.find(Recargo.class, id);
    }

    @Override
    public void update(Recargo recargo) {
       this.entityManager.merge(recargo);
    }

    @Override
    public void delete(Integer id) {
        Recargo recargo=this.read(id);
        this.entityManager.remove(recargo);
    }
}
