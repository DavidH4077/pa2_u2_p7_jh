package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;

public interface EmpaqueRepository {
   
    public void create(Empaque empaque);

    public Empaque read(Integer id);

    public void update(Empaque empaque);

    public void delete(Integer id);
}
