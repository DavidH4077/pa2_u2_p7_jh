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

        //Create(insert)
        
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba 2");
        pedido.setPrecio(10.0);
        pedido.setFecha(LocalDateTime.now());
        
        this.pedidoService.guardar(pedido);
        

        //Read(buscar)
        Pedido pedido1 = this.pedidoService.buscarPorID(2);
        System.out.println("Pedido encontrado: " + pedido1);

        //Update(actualizar)
        
        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorID(2);
        System.out.println("Pedido actualizado: " + pedido2);

        //Delete(eliminar)
        this.pedidoService.eliminar(2);




        return 0;
    }

}
