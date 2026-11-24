package ece.edu.uce.com.pedidos.domain.repository;

import ece.edu.uce.com.pedidos.domain.model.Envio;

public interface EnvioRepository {
    public void create(Envio envio);

    public Envio read(Integer id);

    public void update(Envio envio);

    public void delete(Integer id);
}
