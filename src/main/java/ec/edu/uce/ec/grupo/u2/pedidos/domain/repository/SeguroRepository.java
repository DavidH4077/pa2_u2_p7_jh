package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;

public interface SeguroRepository {
    public void create(Seguro seguro);
    public Optional<Seguro> read(Integer id);
    public Optional<Seguro> readByNumeroPoliza(String numeroPoliza);
    public List<Seguro> readAll();
    public void update(Seguro seguro);
    public void delete(Integer id);
}