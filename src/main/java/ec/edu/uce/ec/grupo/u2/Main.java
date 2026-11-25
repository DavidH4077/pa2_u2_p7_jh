package ec.edu.uce.ec.grupo.u2;

import java.time.LocalDateTime;

import ec.edu.uce.ec.grupo.u2.pedidos.application.CalificacionService;
import ec.edu.uce.ec.grupo.u2.pedidos.application.EmpaqueService;
import ec.edu.uce.ec.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.ec.grupo.u2.pedidos.application.RecargoService;
import ec.edu.uce.ec.grupo.u2.pedidos.application.ReservaService;
import ec.edu.uce.ec.grupo.u2.pedidos.application.SeguroService;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Calificacion;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Recargo;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.ReservaStock;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private CalificacionService calificacionService;

    @Inject
    private EmpaqueService empaqueService;

    @Inject
    private RecargoService recargoService;

    @Inject
    private ReservaService reservaService;

    @Inject
    private SeguroService seguroService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World");

        // Create (insert)
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba 2");
        pedido.setPrecio(10.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        // Read (buscar)
        Pedido pedido1 = this.pedidoService.buscarPorID(pedido.getId());
        System.out.println("Pedido encontrado: " + pedido1);

        // Update (actualizar)
        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorID(pedido.getId());
        System.out.println("Pedido actualizado: " + pedido2);

        // Delete (eliminar)
        this.pedidoService.eliminar(pedido.getId());

        // Create (insert)
        Calificacion calificacion = new Calificacion();
        calificacion.setCalificacion(10);
        calificacion.setComentario("Excelente producto");
        calificacion.setLlegaATiempo(true);
        calificacion.setCumpleExpectativas(true);
        this.calificacionService.guardar(calificacion);

        // Read (buscar)
        Calificacion calificacion1 = this.calificacionService.buscarPorID(calificacion.getId());
        System.out.println("Calificacion encontrada: " + calificacion1);

        // Update (actualizar)
        calificacion.setCalificacion(8);
        calificacion.setComentario("Buen producto, entrega regular");
        this.calificacionService.actualizar(calificacion);

        Calificacion calificacion2 = this.calificacionService.buscarPorID(calificacion.getId());
        System.out.println("Calificacion actualizada: " + calificacion2);

        // Delete (eliminar)
        this.calificacionService.eliminar(calificacion.getId());

        // Create (insert)
        Empaque empaque = new Empaque();
        empaque.setTipoEmpaque("Plastico");
        empaque.setPesoEmpaque(50);
        empaque.setEsFragil(false);
        empaque.setMensajeRegalo("Gracias por comprar");
        this.empaqueService.guardar(empaque);

        // Read (buscar)
        Empaque empaque1 = this.empaqueService.buscarPorID(empaque.getId());
        System.out.println("Empaque encontrado: " + empaque1);

        // Update (actualizar)
        empaque.setTipoEmpaque("Carton reforzado");
        empaque.setEsFragil(true);
        this.empaqueService.actualizar(empaque);

        Empaque empaque2 = this.empaqueService.buscarPorID(empaque.getId());
        System.out.println("Empaque actualizado: " + empaque2);

        // Delete (eliminar)
        this.empaqueService.eliminar(empaque.getId());

        // Create (insert)
        Recargo recargo = new Recargo();
        recargo.setValorRecargo(2.40);
        recargo.setPorcentajeRecargo(0.15);
        recargo.setBeneficiario("David Herrera");
        recargo.setVoluntario(false);
        this.recargoService.guardar(recargo);

        // Read (buscar)
        Recargo recargo1 = this.recargoService.buscarPorID(recargo.getId());
        System.out.println("Recargo encontrado: " + recargo1);

        // Update (actualizar)
        recargo.setValorRecargo(5.00);
        recargo.setVoluntario(true);
        this.recargoService.actualizar(recargo);

        Recargo recargo2 = this.recargoService.buscarPorID(recargo.getId());
        System.out.println("Recargo actualizado: " + recargo2);

        // Delete (eliminar)
        this.recargoService.eliminar(recargo.getId());

        // Create (insert)
        ReservaStock reserva = new ReservaStock();
        reserva.setCodigoItem("040809");
        reserva.setCantidadReservada(23);
        reserva.setEstadoReserva("No disponible");
        reserva.setFechaReserva(LocalDateTime.now());
        this.reservaService.guardar(reserva);

        // Read (buscar)
        ReservaStock reserva1 = this.reservaService.buscarPorID(reserva.getId());
        System.out.println("Reserva encontrada: " + reserva1);

        // Update (actualizar)
        reserva.setCantidadReservada(50);
        reserva.setEstadoReserva("Disponible");
        this.reservaService.actualizar(reserva);

        ReservaStock reserva2 = this.reservaService.buscarPorID(reserva.getId());
        System.out.println("Reserva actualizada: " + reserva2);

        // Delete (eliminar)
        this.reservaService.eliminar(reserva.getId());

        // Create (insert)
        Seguro seguro = new Seguro();
        seguro.setTipoSeguro("Elite");
        seguro.setValorSeguro(65.23);
        seguro.setCoberturaSeguro("Nacional");
        seguro.setNumeroPoliza("01293221");
        this.seguroService.guardar(seguro);

        // Read (buscar)
        Seguro seguro1 = this.seguroService.buscarPorID(seguro.getId());
        System.out.println("Seguro encontrado: " + seguro1);

        // Update (actualizar)
        seguro.setValorSeguro(120.50);
        seguro.setCoberturaSeguro("Internacional");
        this.seguroService.actualizar(seguro);

        Seguro seguro2 = this.seguroService.buscarPorID(seguro.getId());
        System.out.println("Seguro actualizado: " + seguro2);

        // Delete (eliminar)
        this.seguroService.eliminar(seguro.getId());

        return 0;
    }
}