package ec.edu.uce.ec.grupo.u2.pedidos.application;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.SeguroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class SeguroService {
    @Inject
    private SeguroRepository seguroRepository;

    public void guardar(Seguro seguro) {
        this.seguroRepository.create(seguro);
    }

    public Seguro buscarPorID(Integer id) {
        return this.seguroRepository.read(id);
    }

    public void actualizar(Seguro seguro) {
        this.seguroRepository.update(seguro);
    }

    public void eliminar(Integer id) {
        this.seguroRepository.delete(id);
    }
}
