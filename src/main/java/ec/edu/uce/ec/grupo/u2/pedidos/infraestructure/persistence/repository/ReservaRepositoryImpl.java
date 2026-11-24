package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.ReservaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class ReservaRepositoryImpl implements ReservaRepository  {
    
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(ReservaStock reserva) {
        this.entityManager.persist(reserva);
        
    }

    @Override
    public ReservaStock read(Integer id) {
        
        return this.entityManager.find(ReservaStock.class, id);
    }

    @Override
    public void update(ReservaStock reserva) {
       this.entityManager.merge(reserva);
    }

    @Override
    public void delete(Integer id) {
        ReservaStock reserva=this.read(id);
        this.entityManager.remove(reserva);
    }
}
