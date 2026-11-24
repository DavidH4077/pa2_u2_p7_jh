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

        Pedido pedido = new Pedido();
        pedido.setProducto("Producto 1");
        pedido.setPrecio(10.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        Calificacion calificacion = new Calificacion();
        calificacion.setCalificacion(10);
        calificacion.setComentario("Excelente producto");
         this.calificacionService.guardar(calificacion);

        Empaque empaque=new Empaque();
        empaque.setTipoEmpaque("Plastico");
        empaque.setPesoEmpaque(50);
        empaque.setEsFragil(false);
        empaque.setMensajeRegalo("Gracias por comprar");
        this.empaqueService.guardar(empaque);        
        
        Recargo recargo=new Recargo();
        recargo.setValorRecargo(2.40);
        recargo.setPorcentajeRecargo(0.15);
        recargo.setBeneficiario("David Herrera");
        recargo.setVoluntario(false);
        this.recargoService.guardar(recargo);

        ReservaStock reserva=new ReservaStock();
        reserva.setCodigoItem("040809");
        reserva.setCantidadReservada(23);
        reserva.setEstadoReserva("No disponible");
        reserva.setFechaReserva(LocalDateTime.now());
        this.reservaService.guardar(reserva);

        Seguro seguro=new Seguro();
        seguro.setTipoSeguro("Elite");
        seguro.setValorSeguro(65.23);
        seguro.setCoberturaSeguro("Nacional");
        seguro.setNumeroPoliza("01293221");
        this.seguroService.guardar(seguro);

        return 0;
    }

}
