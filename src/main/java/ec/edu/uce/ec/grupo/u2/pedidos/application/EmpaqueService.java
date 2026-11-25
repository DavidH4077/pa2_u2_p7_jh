package ec.edu.uce.ec.grupo.u2.pedidos.application;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Empaque;
import ec.edu.uce.ec.grupo.u2.pedidos.domain.repository.EmpaqueRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EmpaqueService {
    @Inject
    private EmpaqueRepository empaqueRepository;

    public void guardar(Empaque empaque) {
        this.empaqueRepository.create(empaque);
    }

    public Empaque buscarPorID(Integer id) {
        return this.empaqueRepository.read(id);
    }

    public void actualizar(Empaque empaque) {
        this.empaqueRepository.update(empaque);
    }

    public void eliminar(Integer id) {
        this.empaqueRepository.delete(id);
    }
}
