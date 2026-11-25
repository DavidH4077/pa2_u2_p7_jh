package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {
    public void create(Pedido pedido);
    public Optional<Pedido> read(Integer id);
    public Optional<Pedido> readByNumber(String numero);
    public List<Pedido> readAll();
    public void update(Pedido pedido);
    public void delete(Integer id);
}