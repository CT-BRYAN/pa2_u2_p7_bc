package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    // Create
    public void create(Pedido pedido);

    // Read por id
    public Pedido read(Integer id);

    // Update
    public void update(Pedido pedido);

    // Delete
    public void delete(Integer id);

}
