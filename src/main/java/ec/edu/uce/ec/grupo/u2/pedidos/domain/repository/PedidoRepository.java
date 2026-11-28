package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {
    // Create
    public void create(Pedido pedido);

    // Read por id
    public Optional<Pedido> read(Integer id);

    // Buscar por num
    public Optional<Pedido> readByNumber(String numero);

    // Leer todo
    public List<Pedido> readAll();

    public Optional<Pedido> readByNumberNative(String numero);

    // Leer todo()
    public List<Pedido> readAllNative();

    // Update
    public void update(Pedido pedido);

    // Delete
    public void delete(Integer id);
}
