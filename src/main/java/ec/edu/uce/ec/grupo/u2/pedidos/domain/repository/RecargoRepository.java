package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;

public interface RecargoRepository {
    public void create(Recargo recargo);

    public Recargo read(Integer id);

    public void update(Recargo recargo);

    public void delete(Integer id);
}
