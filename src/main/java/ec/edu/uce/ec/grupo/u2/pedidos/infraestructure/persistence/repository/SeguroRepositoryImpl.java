package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.SeguroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class SeguroRepositoryImpl implements SeguroRepository {
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Seguro seguro) {
        this.entityManager.persist(seguro);
        
    }

    @Override
    public Seguro read(Integer id) {
        
        return this.entityManager.find(Seguro.class, id);
    }

    @Override
    public void update(Seguro seguro) {
       this.entityManager.merge(seguro);
    }

    @Override
    public void delete(Integer id) {
        Seguro seguro=this.read(id);
        this.entityManager.remove(seguro);
    }
}
