package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.EmpaqueRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EmpaqueRepositoryImpl implements EmpaqueRepository {
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Empaque empaque) {
        this.entityManager.persist(empaque);
        
    }

    @Override
    public Empaque read(Integer id) {
        
        return this.entityManager.find(Empaque.class, id);
    }

    @Override
    public void update(Empaque empaque) {
       this.entityManager.merge(empaque);
    }

    @Override
    public void delete(Integer id) {
        Empaque empaque=this.read(id);
        this.entityManager.remove(empaque);
    }
}
