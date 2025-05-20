package pe.edu.cibertec.Starbucks_Clone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
