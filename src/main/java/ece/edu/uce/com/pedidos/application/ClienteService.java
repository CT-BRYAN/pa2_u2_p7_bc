package ece.edu.uce.com.pedidos.application;

import ece.edu.uce.com.pedidos.domain.model.Cliente;
import ece.edu.uce.com.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ClienteService {

    @Inject
    private ClienteRepository clienteRepository;

    public void guardar(Cliente cliente) {
        this.clienteRepository.create(cliente);
    }

    public Cliente buscarPorID(Integer id) {
        return this.clienteRepository.read(id);
    }

    public void actualizar(Cliente cliente) {
        this.clienteRepository.update(cliente);
    }

    public void eliminar(Integer id) {
        this.clienteRepository.delete(id);
    }
}
