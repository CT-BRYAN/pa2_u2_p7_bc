package ec.edu.uce.pa.grupo.u2;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Override
    public int run(String... args) throws Exception {

        /*
         * Pedido pedidoN = new Pedido();
         * pedidoN.setProducto("laptop");
         * pedidoN.setPrecio(100.0);
         * pedidoN.setFecha(LocalDateTime.now());
         * pedidoN.setNumero("PED-0001");
         * this.pedidoService.guardar(pedidoN);
         */

        Optional<Pedido> pedido = this.pedidoService.buscarPorID(100);

        if (pedido.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido.get());
        } else {
            System.out.println("Pedido no encontrado");
        }

        // read by number

        Optional<Pedido> pedidoByNumber = this.pedidoService.buscarPorNumero("PED-0001");
        if (pedidoByNumber.isPresent()) {
            System.out.println("Pedido encontrado POR NUNMERO:" + pedidoByNumber.get());
        } else {
            System.out.println("Pedido no encontrado por numero");
        }

        // read alll

        List<Pedido> pedidoCompleto = this.pedidoService.readAll();

        for (Pedido pedido2 : pedidoCompleto) {
            System.out.println(pedido2);
        }

        // read by number native
        Optional<Pedido> pedidoByNumberNative = this.pedidoService.buscarPorNumeroNative("PED-022");
        if (pedidoByNumberNative.isPresent()) {
            System.out.println("Pedido encontrado por SQL NATIVO: "
                    + pedidoByNumberNative.get());
        } else {
            System.out.println("Pedido no encontrado por SQL NATIVO");
        }

        // read all Native

        List<Pedido> pedidoCompletoNative = this.pedidoService.readAllNative();

        for (Pedido pedido3 : pedidoCompletoNative) {
            System.out.println(pedido3);
        }

        return 0;

    }

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

}
