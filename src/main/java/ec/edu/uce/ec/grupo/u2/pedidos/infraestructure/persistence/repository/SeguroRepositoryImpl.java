package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.SeguroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class SeguroRepositoryImpl implements SeguroRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Seguro seguro) {
        this.entityManager.persist(seguro);
    }

    @Override
    public Optional<Seguro> read(Integer id) {
        Seguro seguro = this.entityManager.find(Seguro.class, id);
        return Optional.ofNullable(seguro);
    }

    @Override
    public void update(Seguro seguro) {
        this.entityManager.merge(seguro);
    }

    @Override
    public void delete(Integer id) {
        Optional<Seguro> seguro = this.read(id);
        seguro.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Seguro> readByNumeroPoliza(String numeroPoliza) {
        try {
            TypedQuery<Seguro> query = this.entityManager.createQuery(
                    "SELECT s FROM Seguro s WHERE s.numeroPoliza = :polizaVariable", Seguro.class);
            query.setParameter("polizaVariable", numeroPoliza);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Seguro> readAll() {
        return null;
    }
}