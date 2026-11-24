package ece.edu.uce.com;

import java.time.LocalDateTime;

import ece.edu.uce.com.pedidos.application.ClienteService;
import ece.edu.uce.com.pedidos.application.DetallePedidoService;
import ece.edu.uce.com.pedidos.application.EnvioService;
import ece.edu.uce.com.pedidos.application.PagoService;
import ece.edu.uce.com.pedidos.application.PedidoService;
import ece.edu.uce.com.pedidos.application.ProductoService;
import ece.edu.uce.com.pedidos.domain.model.Cliente;
import ece.edu.uce.com.pedidos.domain.model.DetallePedido;
import ece.edu.uce.com.pedidos.domain.model.Envio;
import ece.edu.uce.com.pedidos.domain.model.Pago;
import ece.edu.uce.com.pedidos.domain.model.Pedido;
import ece.edu.uce.com.pedidos.domain.model.Producto;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private ProductoService productoService;

    @Inject
    private DetallePedidoService detallePedidoService;

    @Inject
    private EnvioService envioService;

    @Inject
    private PagoService pagoService;

    @Override
    public int run(String... args) throws Exception {

        System.out.println("\nHola mundo con Quarkus");

        System.out.println("\nHola mundo");
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto 1");
        pedido.setPrecio(10.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana Perez");
        cliente.setCorreo("ana.perez@gmail.com");
        cliente.setTelefono("0993454028");
        cliente.setDireccion("Quito");
        this.clienteService.guardar(cliente);

        Producto producto = new Producto();
        producto.setNombre("Teclado");
        producto.setDescripcion("Teclado mecanico");
        producto.setStock(25);
        producto.setDisponible(true);
        this.productoService.guardar(producto);

        DetallePedido detalle = new DetallePedido();
        detalle.setCantidad(2);
        detalle.setPrecioUnitario(10.0);
        detalle.setDescuento(0.0);
        detalle.setSubtotal(20.0);
        this.detallePedidoService.guardar(detalle);

        Envio envio = new Envio();
        envio.setDireccionDestino("Quito");
        envio.setEstadoEnvio("PENDIENTE");
        envio.setCostoEnvio(5.0);
        envio.setFechaEstimadaEntrega("2026-11-26");
        this.envioService.guardar(envio);

        Pago pago = new Pago();
        pago.setMetodoPago("TARJETA");
        pago.setMonto(25.0);
        pago.setEstado("PAGADO");
        pago.setFechaPago("2026-11-23");
        this.pagoService.guardar(pago);

        return 0;
    }

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

}