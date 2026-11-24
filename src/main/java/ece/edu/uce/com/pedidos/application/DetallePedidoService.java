package ece.edu.uce.com.pedidos.application;

import ece.edu.uce.com.pedidos.domain.model.DetallePedido;
import ece.edu.uce.com.pedidos.domain.repository.DetallePedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class DetallePedidoService {

    @Inject
    private DetallePedidoRepository detallePedidoRepository;

    public void guardar(DetallePedido detallePedido) {
        this.detallePedidoRepository.create(detallePedido);
    }

    public DetallePedido buscarPorID(Integer id) {
        return this.detallePedidoRepository.read(id);
    }

    public void actualizar(DetallePedido detallePedido) {
        this.detallePedidoRepository.update(detallePedido);
    }

    public void eliminar(Integer id) {
        this.detallePedidoRepository.delete(id);
    }

}
