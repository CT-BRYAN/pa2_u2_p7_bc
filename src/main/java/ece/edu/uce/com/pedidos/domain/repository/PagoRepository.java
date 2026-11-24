package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.Pago;

public interface PagoRepository {

    public void create(Pago pago);

    public Pago read(Integer id);

    public void update(Pago pago);

    public void delete(Integer id);

}
