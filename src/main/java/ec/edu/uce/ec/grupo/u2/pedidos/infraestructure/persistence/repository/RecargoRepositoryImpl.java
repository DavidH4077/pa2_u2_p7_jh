package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.RecargoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class RecargoRepositoryImpl implements RecargoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Recargo recargo) {
        this.entityManager.persist(recargo);
    }

    @Override
    public Optional<Recargo> read(Integer id) {
        Recargo recargo = this.entityManager.find(Recargo.class, id);
        return Optional.ofNullable(recargo);
    }

    @Override
    public void update(Recargo recargo) {
        this.entityManager.merge(recargo);
    }

    @Override
    public void delete(Integer id) {
        Optional<Recargo> recargo = this.read(id);
        recargo.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Recargo> readByBeneficiario(String beneficiario) {
        try {
            TypedQuery<Recargo> query = this.entityManager.createQuery(
                    "SELECT r FROM Recargo r WHERE r.beneficiario = :beneficiarioVariable", Recargo.class);
            query.setParameter("beneficiarioVariable", beneficiario);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Recargo> readAll() {
        return null;
    }
}