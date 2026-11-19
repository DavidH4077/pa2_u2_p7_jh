package ec.edu.uce.ec.grupo.u2;

import java.time.LocalDateTime;

import ec.edu.uce.ec.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject 
    private PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World");

        Pedido pedido = new Pedido();
        pedido.setProducto("Producto 1");
        pedido.setPrecio(10.0);
        pedido.setFecha(LocalDateTime.now());
        
        this.pedidoService.guardar(pedido);
        return 0;
    }

}
