/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package farmacia.ServiceImplementation;

import farmacia.DAO.dao;
import farmacia.Domain.Producto;
import farmacia.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Servicio
public class ServiceImpl implements Service {

    @Autowired
    private dao repo;

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public void guardar(Producto producto) {
        repo.save(producto);
    }

    @Override
public void eliminar(Producto producto) {
    repo.delete(producto);
}

@Override
public Producto getProducto(Producto producto) {
    return repo.findById(producto.getId()).orElse(null);
}
}

