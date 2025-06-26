/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package farmacia.ServiceImpl;

import farmacia.DAO.dao;
import farmacia.Domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ProductoServiceImpl implements farmacia.Service.Service {

    @Autowired
    private dao repo;

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto getProducto(Producto producto) {
        return repo.findById(producto.getId()).orElse(null);
    }

    @Override
    public void guardar(Producto producto) {
        repo.save(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        repo.delete(producto);
    }
}
