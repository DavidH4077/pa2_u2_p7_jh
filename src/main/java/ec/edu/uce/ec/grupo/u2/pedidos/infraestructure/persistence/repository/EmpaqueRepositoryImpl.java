package ec.edu.uce.ec.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.EmpaqueRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class EmpaqueRepositoryImpl implements EmpaqueRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Empaque empaque) {
        this.entityManager.persist(empaque);
    }

    @Override
    public Optional<Empaque> read(Integer id) {
        Empaque empaque = this.entityManager.find(Empaque.class, id);
        return Optional.ofNullable(empaque);
    }

    @Override
    public void update(Empaque empaque) {
        this.entityManager.merge(empaque);
    }

    @Override
    public void delete(Integer id) {
        Optional<Empaque> empaque = this.read(id);
        empaque.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Empaque> readByTipoEmpaque(String tipoEmpaque) {
        try {
            TypedQuery<Empaque> query = this.entityManager.createQuery(
                    "SELECT e FROM Empaque e WHERE e.tipoEmpaque = :tipoVariable", Empaque.class);
            query.setParameter("tipoVariable", tipoEmpaque);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Empaque> readAll() {
        return null;
    }
}