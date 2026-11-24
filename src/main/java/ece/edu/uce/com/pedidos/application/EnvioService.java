package ece.edu.uce.com.pedidos.application;

import ece.edu.uce.com.pedidos.domain.model.Envio;
import ece.edu.uce.com.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EnvioService {

    @Inject
    private EnvioRepository envioRepository;

    public void guardar(Envio envio) {
        this.envioRepository.create(envio);
    }

    public Envio buscarPorID(Integer id) {
        return this.envioRepository.read(id);
    }

    public void actualizar(Envio envio) {
        this.envioRepository.update(envio);
    }

    public void eliminar(Integer id) {
        this.envioRepository.delete(id);
    }

}