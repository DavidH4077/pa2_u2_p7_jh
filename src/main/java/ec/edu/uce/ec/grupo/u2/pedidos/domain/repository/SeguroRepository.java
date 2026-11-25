package ec.edu.uce.ec.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.ec.grupo.u2.pedidos.domain.model.Seguro;

public interface SeguroRepository {
     //Create
    public void create(Seguro seguro);
    //Read por id
    public Seguro read(Integer id);
    //Update
    public void update(Seguro seguro);
    //Delete
    public void delete(Integer id);
}
