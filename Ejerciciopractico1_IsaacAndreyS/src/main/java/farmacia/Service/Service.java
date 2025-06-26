/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package farmacia.Service;
import farmacia.Domain.Producto;
import java.util.List;
import org.springframework.stereotype.Service;

public interface Service {
List<Producto> getProductos(boolean activos);
Producto getProducto(Producto producto);
    void guardar(Producto producto);
    void eliminar(Producto producto);
}
