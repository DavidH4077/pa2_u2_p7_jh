package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;

public interface ReservaRepository {

    public void create(ReservaStock reserva);

    public ReservaStock read(Integer id);

    public void update(ReservaStock reserva);

    public void delete(Integer id);
}
