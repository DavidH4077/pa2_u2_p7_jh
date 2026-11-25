package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.ReservaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class ReservaRepositoryImpl implements ReservaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(ReservaStock reserva) {
        this.entityManager.persist(reserva);
    }

    @Override
    public Optional<ReservaStock> read(Integer id) {
        ReservaStock reserva = this.entityManager.find(ReservaStock.class, id);
        return Optional.ofNullable(reserva);
    }

    @Override
    public void update(ReservaStock reserva) {
        this.entityManager.merge(reserva);
    }

    @Override
    public void delete(Integer id) {
        Optional<ReservaStock> reserva = this.read(id);
        reserva.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<ReservaStock> readByCodigoItem(String codigoItem) {
        try {
            TypedQuery<ReservaStock> query = this.entityManager.createQuery(
                    "SELECT rs FROM ReservaStock rs WHERE rs.codigoItem = :codigoVariable", ReservaStock.class);
            query.setParameter("codigoVariable", codigoItem);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<ReservaStock> readAll() {
        return null;
    }
}