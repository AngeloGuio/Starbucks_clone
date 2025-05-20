package pe.edu.cibertec.Starbucks_Clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.Starbucks_Clone.model.bd.TamanoBebida;

@Repository
public interface TamanoBebidaRepository extends JpaRepository<TamanoBebida, Integer> {
}
