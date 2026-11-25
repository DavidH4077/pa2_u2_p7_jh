package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;

public interface ReservaRepository {
    public void create(ReservaStock reserva);
    public Optional<ReservaStock> read(Integer id);
    public Optional<ReservaStock> readByCodigoItem(String codigoItem);
    public List<ReservaStock> readAll();
    public void update(ReservaStock reserva);
    public void delete(Integer id);
}