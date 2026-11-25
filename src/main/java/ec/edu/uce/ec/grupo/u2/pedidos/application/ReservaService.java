package ec.edu.uce.ec.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.ReservaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ReservaService {

    @Inject
    private ReservaRepository reservaRepository;

    public void guardar(ReservaStock reserva) {
        this.reservaRepository.create(reserva);
    }

    public Optional<ReservaStock> buscarPorID(Integer id) {
        return this.reservaRepository.read(id);
    }

    public Optional<ReservaStock> buscarPorCodigoItem(String codigoItem) {
        return this.reservaRepository.readByCodigoItem(codigoItem);
    }

    public void actualizar(ReservaStock reserva) {
        this.reservaRepository.update(reserva);
    }

    public void eliminar(Integer id) {
        this.reservaRepository.delete(id);
    }
}