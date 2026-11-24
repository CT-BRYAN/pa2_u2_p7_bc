package ece.edu.uce.com.pedidos.infraestructure.persistence.repository;

import ece.edu.uce.com.pedidos.domain.model.DetallePedido;
import ece.edu.uce.com.pedidos.domain.repository.DetallePedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class DetallePedidoRepositoryImpl implements DetallePedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(DetallePedido detallePedido) {
        this.entityManager.persist(detallePedido);
    }

    @Override
    public DetallePedido read(Integer id) {
        return this.entityManager.find(DetallePedido.class, id);
    }

    @Override
    public void update(DetallePedido detallePedido) {
        this.entityManager.merge(detallePedido);
    }

    @Override
    public void delete(Integer id) {
        DetallePedido detallePedido = this.read(id);
        this.entityManager.remove(detallePedido);
    }

}
