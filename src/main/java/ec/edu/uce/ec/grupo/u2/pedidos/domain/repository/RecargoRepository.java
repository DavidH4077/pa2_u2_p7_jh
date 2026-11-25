package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;

public interface RecargoRepository {
    public void create(Recargo recargo);
    public Optional<Recargo> read(Integer id);
    public Optional<Recargo> readByBeneficiario(String beneficiario);
    public List<Recargo> readAll();
    public void update(Recargo recargo);
    public void delete(Integer id);
}