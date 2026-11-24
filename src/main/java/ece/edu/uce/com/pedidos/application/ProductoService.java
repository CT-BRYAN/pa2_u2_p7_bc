package ece.edu.uce.com.pedidos.application;

import ece.edu.uce.com.pedidos.domain.model.Producto;
import ece.edu.uce.com.pedidos.domain.repository.ProductoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProductoService {

    @Inject
    private ProductoRepository productoRepository;

    public void guardar(Producto producto) {
        this.productoRepository.create(producto);
    }

    public Producto buscarPorID(Integer id) {
        return this.productoRepository.read(id);
    }

    public void actualizar(Producto producto) {
        this.productoRepository.update(producto);
    }

    public void eliminar(Integer id) {
        this.productoRepository.delete(id);
    }

}
