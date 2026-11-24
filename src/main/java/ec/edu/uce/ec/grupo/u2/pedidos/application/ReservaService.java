package ec.edu.uce.ec.grupo.u2.pedidos.application;

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

    public ReservaStock buscarPorID(Integer id) {
        return this.reservaRepository.read(id);
    }

    public void actualizar(ReservaStock reserva) {
        this.reservaRepository.update(reserva);
    }

    public void eliminar(Integer id) {
        this.reservaRepository.delete(id);
    }
}
