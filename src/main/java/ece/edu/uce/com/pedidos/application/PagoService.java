package ece.edu.uce.com.pedidos.application;

import ece.edu.uce.com.pedidos.domain.model.Pago;
import ece.edu.uce.com.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PagoService {

    @Inject
    private PagoRepository pagoRepository;

    public void guardar(Pago pago) {
        this.pagoRepository.create(pago);
    }

    public Pago buscarPorID(Integer id) {
        return this.pagoRepository.read(id);
    }

    public void actualizar(Pago pago) {
        this.pagoRepository.update(pago);
    }

    public void eliminar(Integer id) {
        this.pagoRepository.delete(id);
    }

}
