package ec.edu.uce.ec.grupo.u2;

import java.time.LocalDateTime;
import java.util.Optional;

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

        // ==================== PEDIDO ====================
        // Insert
        Pedido nuevoPedido = new Pedido();
        nuevoPedido.setProducto("Producto 1");
        nuevoPedido.setPrecio(10.0);
        nuevoPedido.setFecha(LocalDateTime.now());
        nuevoPedido.setNumero("PED-001");
        this.pedidoService.guardar(nuevoPedido);

        // Read (buscar por ID)
        Optional<Pedido> pedido = this.pedidoService.buscarPorID(100);
        if (pedido.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido.get());
        } else {
            System.out.println("Pedido no encontrado");
        }

        // Read by number
        Optional<Pedido> pedidoByNumber = this.pedidoService.buscarPorNumero("PED-001");
        if (pedidoByNumber.isPresent()) {
            System.out.println("Pedido encontrado por número: " + pedidoByNumber.get());
        } else {
            System.out.println("Pedido no encontrado por número");
        }

        // ==================== CALIFICACION ====================
        // Insert
        Calificacion nuevaCalificacion = new Calificacion();
        nuevaCalificacion.setCalificacion(10);
        nuevaCalificacion.setComentario("Excelente producto");
        nuevaCalificacion.setLlegaATiempo(true);
        nuevaCalificacion.setCumpleExpectativas(true);
        this.calificacionService.guardar(nuevaCalificacion);

        // Read (buscar por ID)
        Optional<Calificacion> calificacion = this.calificacionService.buscarPorID(100);
        if (calificacion.isPresent()) {
            System.out.println("Calificacion encontrada: " + calificacion.get());
        } else {
            System.out.println("Calificacion no encontrada");
        }

        // Read by comentario
        Optional<Calificacion> calificacionByComentario = this.calificacionService.buscarPorComentario("Excelente producto");
        if (calificacionByComentario.isPresent()) {
            System.out.println("Calificacion encontrada por comentario: " + calificacionByComentario.get());
        } else {
            System.out.println("Calificacion no encontrada por comentario");
        }

        // ==================== EMPAQUE ====================
        // Insert
        Empaque nuevoEmpaque = new Empaque();
        nuevoEmpaque.setTipoEmpaque("Plastico");
        nuevoEmpaque.setPesoEmpaque(50);
        nuevoEmpaque.setEsFragil(false);
        nuevoEmpaque.setMensajeRegalo("Gracias por comprar");
        this.empaqueService.guardar(nuevoEmpaque);

        // Read (buscar por ID)
        Optional<Empaque> empaque = this.empaqueService.buscarPorID(100);
        if (empaque.isPresent()) {
            System.out.println("Empaque encontrado: " + empaque.get());
        } else {
            System.out.println("Empaque no encontrado");
        }

        // Read by tipoEmpaque
        Optional<Empaque> empaqueByTipo = this.empaqueService.buscarPorTipoEmpaque("Plastico");
        if (empaqueByTipo.isPresent()) {
            System.out.println("Empaque encontrado por tipo: " + empaqueByTipo.get());
        } else {
            System.out.println("Empaque no encontrado por tipo");
        }

        // ==================== RECARGO ====================
        // Insert
        Recargo nuevoRecargo = new Recargo();
        nuevoRecargo.setValorRecargo(2.40);
        nuevoRecargo.setPorcentajeRecargo(0.15);
        nuevoRecargo.setBeneficiario("David Herrera");
        nuevoRecargo.setVoluntario(false);
        this.recargoService.guardar(nuevoRecargo);

        // Read (buscar por ID)
        Optional<Recargo> recargo = this.recargoService.buscarPorID(100);
        if (recargo.isPresent()) {
            System.out.println("Recargo encontrado: " + recargo.get());
        } else {
            System.out.println("Recargo no encontrado");
        }

        // Read by beneficiario
        Optional<Recargo> recargoByBeneficiario = this.recargoService.buscarPorBeneficiario("David Herrera");
        if (recargoByBeneficiario.isPresent()) {
            System.out.println("Recargo encontrado por beneficiario: " + recargoByBeneficiario.get());
        } else {
            System.out.println("Recargo no encontrado por beneficiario");
        }

        // ==================== RESERVA STOCK ====================
        // Insert
        ReservaStock nuevaReserva = new ReservaStock();
        nuevaReserva.setCodigoItem("040809");
        nuevaReserva.setCantidadReservada(23);
        nuevaReserva.setEstadoReserva("No disponible");
        nuevaReserva.setFechaReserva(LocalDateTime.now());
        this.reservaService.guardar(nuevaReserva);

        // Read (buscar por ID)
        Optional<ReservaStock> reserva = this.reservaService.buscarPorID(100);
        if (reserva.isPresent()) {
            System.out.println("Reserva encontrada: " + reserva.get());
        } else {
            System.out.println("Reserva no encontrada");
        }

        // Read by codigoItem
        Optional<ReservaStock> reservaByCodigo = this.reservaService.buscarPorCodigoItem("040809");
        if (reservaByCodigo.isPresent()) {
            System.out.println("Reserva encontrada por código: " + reservaByCodigo.get());
        } else {
            System.out.println("Reserva no encontrada por código");
        }

        // ==================== SEGURO ====================
        // Insert
        Seguro nuevoSeguro = new Seguro();
        nuevoSeguro.setTipoSeguro("Elite");
        nuevoSeguro.setValorSeguro(65.23);
        nuevoSeguro.setCoberturaSeguro("Nacional");
        nuevoSeguro.setNumeroPoliza("01293221");
        this.seguroService.guardar(nuevoSeguro);

        // Read (buscar por ID)
        Optional<Seguro> seguro = this.seguroService.buscarPorID(100);
        if (seguro.isPresent()) {
            System.out.println("Seguro encontrado: " + seguro.get());
        } else {
            System.out.println("Seguro no encontrado");
        }

        // Read by numeroPoliza
        Optional<Seguro> seguroByPoliza = this.seguroService.buscarPorNumeroPoliza("01293221");
        if (seguroByPoliza.isPresent()) {
            System.out.println("Seguro encontrado por póliza: " + seguroByPoliza.get());
        } else {
            System.out.println("Seguro no encontrado por póliza");
        }

        return 0;
    }
}