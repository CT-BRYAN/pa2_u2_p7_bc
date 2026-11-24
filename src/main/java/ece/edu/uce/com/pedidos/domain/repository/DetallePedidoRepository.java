package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.DetallePedido;

public interface DetallePedidoRepository {

    public void create(DetallePedido detallePedido);

    public DetallePedido read(Integer id);

    public void update(DetallePedido detallePedido);

    public void delete(Integer id);

}
