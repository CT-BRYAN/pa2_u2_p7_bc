package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.Producto;

public interface ProductoRepository {
    public void create(Producto producto);

    public Producto read(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);

}
