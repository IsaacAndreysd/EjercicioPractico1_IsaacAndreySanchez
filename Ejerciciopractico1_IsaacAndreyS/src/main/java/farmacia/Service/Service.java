/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package farmacia.Service;
import farmacia.Domain.Producto;
import java.util.List;

public interface Service {
    List<Producto> listar();
    Producto getProducto(Producto producto);
    void guardar(Producto producto);
    void eliminar(Producto producto);
}
