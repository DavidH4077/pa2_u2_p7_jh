package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;

public interface EmpaqueRepository {
    public void create(Empaque empaque);
    public Optional<Empaque> read(Integer id);
    public Optional<Empaque> readByTipoEmpaque(String tipoEmpaque);
    public List<Empaque> readAll();
    public void update(Empaque empaque);
    public void delete(Integer id);
}