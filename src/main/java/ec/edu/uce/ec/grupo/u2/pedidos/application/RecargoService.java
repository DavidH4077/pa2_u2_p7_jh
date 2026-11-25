package ec.edu.uce.ec.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.RecargoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class RecargoService {

    @Inject
    private RecargoRepository recargoRepository;

    public void guardar(Recargo recargo) {
        this.recargoRepository.create(recargo);
    }

    public Optional<Recargo> buscarPorID(Integer id) {
        return this.recargoRepository.read(id);
    }

    public Optional<Recargo> buscarPorBeneficiario(String beneficiario) {
        return this.recargoRepository.readByBeneficiario(beneficiario);
    }

    public void actualizar(Recargo recargo) {
        this.recargoRepository.update(recargo);
    }

    public void eliminar(Integer id) {
        this.recargoRepository.delete(id);
    }
}