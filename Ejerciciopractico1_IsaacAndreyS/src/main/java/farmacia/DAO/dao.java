/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package farmacia.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author isaac
 */
import farmacia.Domain.Producto;

public interface dao extends JpaRepository<Producto, Long> {
}
