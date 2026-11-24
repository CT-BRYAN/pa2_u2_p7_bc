package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    public void create(Cliente cliente);

    public Cliente read(Integer id);

    public void update(Cliente cliente);

    public void delete(Integer id);

}
