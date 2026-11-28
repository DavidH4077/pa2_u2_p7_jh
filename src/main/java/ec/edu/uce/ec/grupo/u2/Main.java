package ec.edu.uce.ec.grupo.u2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        // Create
        Pedido p1 = new Pedido();
        p1.setNumero("PED-001");
        p1.setPrecio(21.3);
        p1.setFecha(LocalDateTime.now());
        p1.setProducto("Computadora2");
        // this.pedidoService.guardar(p1);

        /*
         * //Read(buscar)
         * Optional<Pedido> pedido = this.pedidoService.buscarPorID(100);
         * if (pedido.isPresent()) {
         * System.out.println("Pedido encontrado: " + pedido.get());
         * } else {
         * System.out.println("Pedido no encontrado");
         * }
         * //READ by number
         * Optional<Pedido> pedidoByNumber =
         * this.pedidoService.buscarPorNumero("PED-001");
         * if (pedidoByNumber.isPresent()) {
         * System.out.println("Pedido encontrado por número: " + pedidoByNumber.get());
         * } else {
         * System.out.println("Pedido no encontrado por número");
         * }
         */
        // Read ALL
        // NATIVE READ ALL

        List<Pedido> lista = this.pedidoService.buscarPorTodoNative();
        for (Pedido x : lista) {
            System.out.println(x.toString());

        }

        System.out.println(" Buscar  todo native");
        // native buscae numeros
        Optional<Pedido> Pedido4 = pedidoService.buscarPorNumeroNative("PED-001");
        System.out.println(" Buscar por native :" + Pedido4);

        List<Pedido> lista2 = this.pedidoService.buscarPorTodoNative();
        for (Pedido x1 : lista2) {
            System.out.println(x1.toString());
        }

        return 0;
    }

}
